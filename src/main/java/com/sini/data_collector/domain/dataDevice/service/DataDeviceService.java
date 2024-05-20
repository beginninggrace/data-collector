package com.sini.data_collector.domain.dataDevice.service;

import com.sini.data_collector.domain.dataDevice.dto.DataRequestDto;
import com.sini.data_collector.domain.dataDevice.dto.DataResponseDto;
import com.sini.data_collector.domain.dataDevice.entity.DataDeviceGroup;
import com.sini.data_collector.domain.dataDevice.repository.DataDeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataDeviceService {

    private final DataDeviceRepository dataDeviceRepository;
    public DataResponseDto createDataDeviceGroup(DataRequestDto dataRequestDto) {
        DataDeviceGroup dataDeviceGroup = dataDeviceRepository.save(new DataDeviceGroup(dataRequestDto));
        return new DataResponseDto(
            dataDeviceGroup.getDataDeviceGroupId(),
            dataDeviceGroup.getSerialNumber(),
            dataDeviceGroup.getCreatedAt()
        );
    }
}
