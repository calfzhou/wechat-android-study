package com.tencent.mm.model;

import android.os.Process;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

final class ck
  implements br
{
  private String dlO = "";
  private String path = "";
  private int result = 0;
  public int type = -1;

  public ck(String paramString1, String paramString2)
  {
    this.dlO = paramString1;
    int i = this.dlO.indexOf("<ccr>");
    int m;
    if (i < 0)
    {
      m = 0;
      if (m == 0)
        break label106;
      this.type = 1;
      this.path = paramString2;
    }
    while (true)
    {
      return;
      int j = i + 5;
      int k = this.dlO.indexOf("</ccr>", j);
      if ((k < 0) || (k <= j))
      {
        m = 0;
        break;
      }
      m = 1;
      break;
      label106: boolean bool = this.dlO.startsWith("ver");
      int n = 0;
      if (!bool);
      while (n != 0)
      {
        this.type = 2;
        this.path = paramString2;
        return;
        this.dlO = this.dlO.substring(3);
        String str = this.dlO;
        n = 0;
        if (str != null)
        {
          int i1 = this.dlO.length();
          n = 0;
          if (i1 >= 8)
            n = 1;
        }
      }
    }
  }

  public final boolean rD()
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(this.type);
    arrayOfObject1[1] = this.path;
    arrayOfObject1[2] = Boolean.valueOf(ch.lV());
    z.d("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "doInBackground type:%d path:%s runningTypeVer:%b", arrayOfObject1);
    if (this.type == -1);
    while (com.tencent.mm.sdk.platformtools.ch.jb(this.path))
      return false;
    if (this.type == 2)
    {
      if (ch.lV())
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Integer.valueOf(this.type);
        arrayOfObject3[1] = Boolean.valueOf(ch.lV());
        z.v("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "doInBackground giveup type:%d runn:%b", arrayOfObject3);
        return false;
      }
      ch.rB();
    }
    long l = com.tencent.mm.sdk.platformtools.ch.CM();
    Process.setThreadPriority(Process.myTid(), 1);
    NorMsgSource.setLog(0);
    this.result = NorMsgSource.norMsgSourceGet(this.path, this.dlO);
    Object[] arrayOfObject2 = new Object[6];
    arrayOfObject2[0] = Long.valueOf(com.tencent.mm.sdk.platformtools.ch.ac(l));
    arrayOfObject2[1] = Integer.valueOf(this.type);
    arrayOfObject2[2] = this.path;
    arrayOfObject2[3] = this.dlO;
    arrayOfObject2[4] = Integer.valueOf(this.result);
    arrayOfObject2[5] = Integer.valueOf(Process.getThreadPriority(Process.myTid()));
    z.d("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "doInBackground time:%d type:%d path:%s src:%s %x pri:%d ", arrayOfObject2);
    return true;
  }

  public final boolean rE()
  {
    if (!bg.oE())
      z.e("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "onPostExecute  has not set uin");
    do
    {
      return false;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(this.type);
      arrayOfObject1[1] = Integer.valueOf(this.result);
      z.d("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "onPostExecute type:%d result:%x", arrayOfObject1);
      if (this.result == 0)
        z.e("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "onPostExecute result is null.");
      if (this.type == 1)
      {
        e locale = bg.qW().oQ();
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(this.result);
        locale.set(70, String.format("<ccs>%x</ccs>", arrayOfObject4));
        return false;
      }
    }
    while (this.type != 2);
    Object[] arrayOfObject2 = new Object[4];
    arrayOfObject2[0] = Integer.valueOf(this.result);
    arrayOfObject2[1] = Integer.valueOf(NorMsgSource.getCrc(this.result, this.type));
    int i;
    if (ch.rA())
    {
      i = 1;
      arrayOfObject2[2] = Integer.valueOf(i);
      if (!ch.checkMsgLevel())
        break label267;
    }
    label267: for (int j = 1; ; j = 0)
    {
      arrayOfObject2[3] = Integer.valueOf(j);
      String str = String.format("_%x_%x_%d_%d", arrayOfObject2);
      bg.qW().oQ().set(71, str);
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = Integer.valueOf(this.type);
      arrayOfObject3[1] = Integer.valueOf(this.result);
      arrayOfObject3[2] = str;
      z.d("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "onPostExecute type:%d result:%x secr:%s", arrayOfObject3);
      return false;
      i = 0;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ck
 * JD-Core Version:    0.6.2
 */