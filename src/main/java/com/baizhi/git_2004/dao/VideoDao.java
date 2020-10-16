package com.baizhi.git_2004.dao;

import com.baizhi.git_2004.entity.Video;

import java.util.List;

public interface VideoDao {

    List<Video> queryByLike(String content);

    Video queryById(String id);
}
