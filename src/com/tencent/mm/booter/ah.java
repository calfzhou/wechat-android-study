package com.tencent.mm.booter;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.protocal.a.qc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.d;
import java.util.LinkedList;

public final class ah
{
  public static void run()
  {
    LinkedList localLinkedList = new LinkedList();
    int i = ch.a((Integer)bg.qP().get(19), 0);
    for (int j = 0; j < i; j++)
    {
      qc localqc1 = new qc();
      localqc1.hPS = 31;
      localqc1.ifH = "0";
      localLinkedList.add(localqc1);
    }
    int k = ch.a((Integer)bg.qP().get(20), 0);
    for (int m = 0; m < k; m++)
    {
      qc localqc2 = new qc();
      localqc2.hPS = 31;
      localqc2.ifH = "1";
      localLinkedList.add(localqc2);
    }
    if (localLinkedList.size() > 0)
    {
      cx.a(localLinkedList);
      bg.qP().set(19, Integer.valueOf(0));
      bg.qP().set(20, Integer.valueOf(0));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.ah
 * JD-Core Version:    0.6.2
 */