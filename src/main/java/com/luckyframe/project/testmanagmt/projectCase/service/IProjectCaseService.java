package com.luckyframe.project.testmanagmt.projectCase.service;

import java.util.List;

import com.luckyframe.project.testmanagmt.projectCase.domain.ProjectCase;

/**
 * 项目测试用例管理 服务层
 * 
 * @author luckyframe
 * @date 2019-02-26
 */
public interface IProjectCaseService 
{
	/**
     * 查询项目测试用例管理信息
     * 
     * @param caseId 项目测试用例管理ID
     * @return 项目测试用例管理信息
     */
	public ProjectCase selectProjectCaseById(Integer caseId);
	
	/**
     * 查询项目测试用例管理列表
     * 
     * @param projectCase 项目测试用例管理信息
     * @return 项目测试用例管理集合
     */
	public List<ProjectCase> selectProjectCaseList(ProjectCase projectCase);
	
	/**
     * 新增项目测试用例管理
     * 
     * @param projectCase 项目测试用例管理信息
     * @return 结果
     */
	public int insertProjectCase(ProjectCase projectCase);
	
	/**
     * 修改项目测试用例管理
     * 
     * @param projectCase 项目测试用例管理信息
     * @return 结果
     */
	public int updateProjectCase(ProjectCase projectCase);
		
	/**
     * 删除项目测试用例管理信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteProjectCaseByIds(String ids);
	
    /**
     * 校验测试用例名称是否唯一
     * @param projectCase
     * @return
     * @author Seagull
     * @date 2019年2月28日
     */
    public String checkProjectCaseNameUnique(ProjectCase projectCase);
}
