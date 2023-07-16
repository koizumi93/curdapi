package com.koizumi.curdapi.mapper;

import com.koizumi.curdapi.entity.Name;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface NameMapper {
    //名前とidの表示
    @Select("SELECT * FROM names")
    List<Name> findAll();
    
    //id指定で名前の表示
    @Select("SELECT * FROM names WHERE id = #{id}")
    Name findById(int id);
    
    //名前の登録
    @Insert("INSERT INTO names(name) VALUES(#{names})")
    void create(Name name);
    
    //名前の更新
    @Update("UPDATE names SET name = #{name} WHERE id = #{id}")
    void update(@Param("id") int id, @Param("name") String name);
    
    //idの削除
    @Delete("DELETE FROM names WHERE id = #{id}")
    void delete(@Param("id") int id);
}
