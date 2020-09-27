package com.jrp.projectmanagement.pma.dao;

import com.jrp.projectmanagement.pma.dto.ChartData;
import com.jrp.projectmanagement.pma.entitites.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    @Override
    List<Project> findAll();

    @Query(nativeQuery = true, value = "SELECT stage as label, COUNT(*) as value " +
            "FROM project " +
            "GROUP BY stage")
    List<ChartData> getProjectStatus();

}
