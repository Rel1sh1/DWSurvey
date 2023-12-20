package net.diaowen.dwsurvey.dao.impl;

import java.util.ArrayList;
import java.util.List;

import net.diaowen.dwsurvey.dao.AnOrderDao;
import net.diaowen.dwsurvey.entity.AnOrder;
import net.diaowen.dwsurvey.entity.QuOrderby;
import net.diaowen.dwsurvey.entity.Question;
import org.springframework.stereotype.Repository;

import net.diaowen.common.dao.BaseDaoImpl;

/**
 * 排序题DAO 实现类
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */

@Repository
public class AnOrderDaoImpl extends BaseDaoImpl<AnOrder, String> implements AnOrderDao {


	@Override
	public void findGroupStats(Question question) {
		String sql="select qu_row_id,sum(ordery_num) sumOrderNum from t_an_order where visibility=1 and qu_id=? group by qu_row_id order by sumOrderNum";//构建SQL查询语句
		List<Object[]> list=this.getSession().createSQLQuery(sql).setParameter(1,question.getId()).list();// 执行SQL查询并获取结果
		List<QuOrderby> quOrderbies=question.getQuOrderbys();//得到该问题中的所有排序项

		List<QuOrderby> list2 = new ArrayList<>();// 创建一个新的排序项列表，用于存储结果
		for (Object[] objects : list) {//遍历SQL查询结果

			// 解析查询结果
			Float sumOrderyNum=Float.parseFloat(objects[1].toString());
			String quOrderById= objects[0].toString();

			for (QuOrderby quOrderby : quOrderbies) {//遍历每个排序项，每个选项对应的排序序号
				if(quOrderById.equals(quOrderby.getId())){
					quOrderby.setAnOrderSum(sumOrderyNum.intValue());
					list2.add(quOrderby);
				}
			}
		}

		question.setQuOrderbys(list2);

	}

}
