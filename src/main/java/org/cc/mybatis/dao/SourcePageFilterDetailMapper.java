package org.cc.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cc.mybatis.model.SourcePageFilterDetail;
import org.cc.mybatis.model.SourcePageFilterDetailExample;

public interface SourcePageFilterDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    int countByExample(SourcePageFilterDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    int deleteByExample(SourcePageFilterDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    int insert(SourcePageFilterDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    int insertSelective(SourcePageFilterDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    List<SourcePageFilterDetail> selectByExample(SourcePageFilterDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    SourcePageFilterDetail selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    int updateByExampleSelective(@Param("record") SourcePageFilterDetail record, @Param("example") SourcePageFilterDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    int updateByExample(@Param("record") SourcePageFilterDetail record, @Param("example") SourcePageFilterDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    int updateByPrimaryKeySelective(SourcePageFilterDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_source_page_filter_detail
     *
     * @mbggenerated Wed Oct 08 16:12:34 SGT 2014
     */
    int updateByPrimaryKey(SourcePageFilterDetail record);
}