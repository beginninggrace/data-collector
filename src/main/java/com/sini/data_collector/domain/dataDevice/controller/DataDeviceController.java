package com.sini.data_collector.domain.dataDevice.controller;

import com.sini.data_collector.common.Response;
import com.sini.data_collector.domain.dataDevice.dto.DataRequestDto;
import com.sini.data_collector.domain.dataDevice.dto.DataResponseDto;
import com.sini.data_collector.domain.dataDevice.service.DataDeviceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/data-collector")
public class DataDeviceController {

    private final DataDeviceService dataDeviceService;

    @PostMapping
    public Response<DataResponseDto> createDataDeviceGroup(
        @Valid @RequestBody DataRequestDto dataRequestDto
    ) {
        DataResponseDto response = dataDeviceService.createDataDeviceGroup(dataRequestDto);
        return Response.ok(response);
    }
}
