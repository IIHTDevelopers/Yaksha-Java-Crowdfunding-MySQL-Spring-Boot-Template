package com.crowdfunding.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crowdfunding.dto.ProjectDTO;
import com.crowdfunding.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Override
	public ProjectDTO createProject(ProjectDTO projectDTO) {
		// write your logic here
		return null;
	}

	@Override
	public ProjectDTO updateProject(Long projectId, ProjectDTO projectDTO) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteProject(Long projectId) {
		// write your logic here
		return false;
	}

	@Override
	public ProjectDTO getProjectById(Long projectId) {
		// write your logic here
		return null;
	}

	@Override
	public List<ProjectDTO> getAllProjects() {
		// write your logic here
		return null;
	}
}
