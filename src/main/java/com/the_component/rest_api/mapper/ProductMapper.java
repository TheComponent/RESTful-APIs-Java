package com.the_component.rest_api.mapper;

import com.the_component.rest_api.dto.ProductRequestDto;
import com.the_component.rest_api.dto.ProductResponseDto;
import com.the_component.rest_api.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductRequestDto productRequestDto);

    ProductResponseDto toProductResponse(Product product);

    Product updateProduct(@MappingTarget Product product, ProductRequestDto productRequestDto);
}
