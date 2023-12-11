package kr.leedox.repository;

import kr.leedox.dto.ArtifactDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArtifactMapper {
    List<ArtifactDTO> getList();
}
