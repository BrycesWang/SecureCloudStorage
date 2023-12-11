package cn.xjtu.iotlab.dao;

import cn.xjtu.iotlab.vo.BFFile;
import cn.xjtu.iotlab.vo.Files;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.List;
import java.util.Set;

@Repository
public interface FilesManagerMapper {
    //获取数据库中所有文件
    public List<Files> getAllFileList(String userName);

    //向数据库中插入文件
    public int insertFiles(Files file);

    //根据id搜索文件
    public Files searchById(int id);

    //获取数据库中所有id
    public Set<Integer> getAllId();

    //删除数据库所有内容
    public void deleteAll();

    //获取用户根目录文件
    public List<Files> getRootFile(String userName);

    //明文局部搜索
    public List<Files> getFilesByNameLocal(String fileName, String userName, String suffixName);

    //明文全局搜索
    public List<Files> getFilesByNameGlobal(String fileName, String suffixName);

    //插入文件的BF值
    public void insertFilesBF(BFFile bfFile);

    //根据文件名搜索Id
    public int getIdByName(String fileName, String userName, int PID);

    //BF局部搜索
    public List<Files> getFilesByBFLocal(String bfValue, String userName, String suffixName);

    //BF全局搜索
    public List<Files> getFilesByBFGlobal(String bfValue, String suffixName);

    //获取到当前id的最大值，方便上传文件后将其插入数据库
    public int getMaxId();

    public int getBFencPID(String username);

    public int getBFdecPID(String username);

}
