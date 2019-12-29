package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.Clazz;
import com.briup.zhihuipingjiao.bean.SurveyExample;
import com.briup.zhihuipingjiao.bean.ex.ClazzEX;
import com.briup.zhihuipingjiao.mapper.ClazzMapper;
import com.briup.zhihuipingjiao.mapper.SurveyMapper;
import com.briup.zhihuipingjiao.mapper.ex.ClazzEXMapper;
import com.briup.zhihuipingjiao.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements IClazzService {
    @Autowired
    private ClazzEXMapper clazzEXMapper;
    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private SurveyMapper surveyMapper;
    @Override
    public List<ClazzEX> findAllEX() throws RuntimeException {

        List<ClazzEX> list = clazzEXMapper.findAll();

        return list;
    }

    @Override
    public void save(Clazz clazz) throws RuntimeException {
        clazzMapper.insert(clazz);
    }

    @Override
    public void deleteById(int id) throws RuntimeException {

        SurveyExample example=new SurveyExample();
        example.createCriteria().andClazzIdEqualTo(id);
        surveyMapper.deleteByExample(example);
        clazzMapper.deleteByPrimaryKey(id);
    }

    public List<ClazzEX> searchEx(String key, String word) throws RuntimeException {
        //word为空,key为空
        if ((key == null || key.equals(""))&& (word == null || word.equals(""))){
            return clazzEXMapper.findAll();
            //word不为空，key为空
        } else if(key == null || key.equals("") && (word !=null || !key.equals(""))){
            word = "%"+word+"%";
            return clazzEXMapper.selectClazz(word);
        }  else if (key.equals(word)){
            word = "%"+word+"%";
            return clazzEXMapper.selectClazz(word);
        }
        return null;
    }
}
