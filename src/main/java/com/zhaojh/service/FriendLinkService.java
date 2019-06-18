package com.zhaojh.service;

import com.zhaojh.model.FriendLink;
import com.zhaojh.model.Result;
import net.sf.json.JSONArray;

public interface FriendLinkService {

    Result addFriendLink(FriendLink friendLink);

    JSONArray getAllFriendLink();

    Result updateFriendLink(FriendLink friendLink, int id);

    Result deleteFriendLink(int id);

    Result getFriendLink();
}
