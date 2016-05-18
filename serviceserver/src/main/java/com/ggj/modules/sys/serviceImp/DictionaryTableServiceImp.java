package com.ggj.modules.sys.serviceImp;

import com.ggj.modules.crud.CrudService;
import com.ggj.modules.sys.dao.DictionaryTableDao;
import com.ggj.myinterface.account.bean.User;
import com.ggj.myinterface.sys.bean.DictionaryTable;
import com.ggj.myinterface.sys.service.DictionaryTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:gaoguangjin
 * @Description:
 * @Email:335424093@qq.com
 * @Date 2016/4/19 18:42
 */
@Service
@Slf4j
@Transactional(readOnly = true)
public class DictionaryTableServiceImp  extends CrudService<DictionaryTableDao, DictionaryTable> implements DictionaryTableService {


    public void insert(DictionaryTable entity) {

    }
}
