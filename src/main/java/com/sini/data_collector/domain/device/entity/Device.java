package com.sini.data_collector.domain.device.entity;

import com.sini.data_collector.domain.dataDevice.entity.DataDeviceGroup;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deviceId;
    @Column(nullable = false)
    private String serialNumber;
    @ManyToOne
    @JoinColumn(name = "stationGroupId")
    private DataDeviceGroup stationGroup;
    @Column(nullable = false)
    private LocalDateTime createdAt;

}
