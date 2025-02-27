package com.eusebio.util;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MapperUtil {

    private final ApplicationContext applicationContext;

    public <S, T> List<T> mapList(List<S> source, Class<T> targetClass, String... mapperQualitier) {
        ModelMapper modelMapper = getModelMapper(mapperQualitier);

        return source
                .stream()
                .map(element -> modelMapper.map(element, targetClass))
                .toList();
    }

    public <S, T> T map(S source, Class<T> targetClass, String... mapperQualitier) {
        ModelMapper modelMapper = getModelMapper(mapperQualitier);
        return modelMapper.map(source, targetClass);
    }

    private ModelMapper getModelMapper(String... mapperQualitier) {
        if (mapperQualitier.length == 0 || mapperQualitier[0] == null || mapperQualitier[0].isEmpty()) {
            return applicationContext.getBean("defaultMapper", ModelMapper.class);
        }
        else{
            return applicationContext.getBean(mapperQualitier[0], ModelMapper.class);
        }
    }
}
