package com.sini.data_collector.domain.dataDevice.dto;

import lombok.Getter;

@Getter
public class DataDeviceResponseDto {

    private String deviceId;
    private String serialNumber;
    private DataResponseDto stationGroup;

    public DataDeviceResponseDto(
        String deviceId, String serialNumber, DataResponseDto DataResponseDto
    ) {
        this.deviceId = deviceId;
        this.serialNumber = serialNumber;
        this.stationGroup = DataResponseDto;
    }
}
