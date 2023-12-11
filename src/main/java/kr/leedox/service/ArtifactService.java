package kr.leedox.service;

import kr.leedox.dto.ArtifactDTO;
import kr.leedox.repository.ArtifactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtifactService {

    @Autowired
    ArtifactMapper artifactMapper;
    public List<ArtifactDTO> getList() {
        return artifactMapper.getList();
    }
}
