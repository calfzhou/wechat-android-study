package com.tencent.mm.modelfriend;

import android.content.ContentValues;

public final class ag
{
  private int cGN = -1;
  private int dlX = 0;
  private String dlZ = "";
  private String dma = "";
  private int dql = 0;
  private int dtY = 0;
  private int dtZ = 0;
  private String username = "";

  public final void dx(int paramInt)
  {
    this.dtY = paramInt;
  }

  public final void dy(int paramInt)
  {
    this.dql = paramInt;
  }

  public final String getUsername()
  {
    if (this.username == null)
      return "";
    return this.username;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("username", getUsername());
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("friendtype", Integer.valueOf(this.dtY));
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("updatetime", Integer.valueOf(this.dql));
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("reserved1", Integer.valueOf(this.dlX));
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("reserved2", Integer.valueOf(this.dtZ));
    String str2;
    if ((0x20 & this.cGN) != 0)
    {
      if (this.dlZ == null)
      {
        str2 = "";
        localContentValues.put("reserved3", str2);
      }
    }
    else if ((0x40 & this.cGN) != 0)
      if (this.dma != null)
        break label181;
    label181: for (String str1 = ""; ; str1 = this.dma)
    {
      localContentValues.put("reserved4", str1);
      return localContentValues;
      str2 = this.dlZ;
      break;
    }
  }

  public final void rF()
  {
    this.cGN = -1;
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ag
 * JD-Core Version:    0.6.2
 */