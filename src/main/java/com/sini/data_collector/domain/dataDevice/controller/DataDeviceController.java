package com.sini.data_collector.domain.dataDevice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/data-collector")
public class DataDeviceController {

//    private final DataDeviceService dataDeviceService;

//    @PostMapping
//    public Response<DataResponseDto> createDataDeviceGroup(
//        @Valid @RequestBody DataRequestDto dataRequestDto
//    ) {
//        DataResponseDto response = dataDeviceService.createDataDeviceGroup(dataRequestDto);
//        return Response.ok(response);
//    }
}
