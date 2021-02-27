package com.jagex.game.entity.player.creation;

import com.jagex.ClientTriggerType;
import com.jagex.IterableNodeMap;
import com.jagex.Node;
import com.jagex.PathingEntity;
import com.jagex.client.cache.CacheableNode_Sub7;
import com.jagex.client.cs2.CS2Executor;

public class AccountCreationStage {

	public static CacheableNode_Sub7 aCacheableNode_Sub7_12;
	public static AccountCreationStage REQUEST = new AccountCreationStage();
	public static AccountCreationStage RESPONSE = new AccountCreationStage();

	public static void method252(ClientTriggerType class397_0, int i_1, PathingEntity animable_3, int i_4) {
		CS2Executor cs2executor_6 = CS2Executor.getNextScriptExecutor();
		cs2executor_6.currentEntity = animable_3;
		cs2executor_6.anInt7004 = i_4;
		CS2Executor.method1834(class397_0, i_1, -1, cs2executor_6);
		cs2executor_6.currentEntity = null;
		cs2executor_6.anInt7004 = -1;
	}

	public static void insertEmptyNode(int id, IterableNodeMap<Node> map) {
		if (id != -1 && map.get(id) == null)
			map.put(new Node<>(), id);
	}
}
