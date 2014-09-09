package com.tencent.mm.ui.chatting;

import com.tencent.mm.ai.b;
import com.tencent.mm.storage.ar;

final class ms
{
  String cDa;
  String cDi;
  String cLi;
  ar cMM;
  String cNM;
  String cNN;
  String ddY;
  long fcD;
  int fjl;
  int hmV;
  boolean iWI;
  boolean juX;
  String juY;
  b juZ;
  boolean jva;
  int position;
  String title;

  public ms()
  {
  }

  private ms(ar paramar, boolean paramBoolean, int paramInt1, String paramString, int paramInt2)
  {
    this(paramar, paramBoolean, paramInt1, paramString, paramInt2, false);
  }

  public ms(ar paramar, boolean paramBoolean, int paramInt1, String paramString, int paramInt2, byte paramByte)
  {
    this(paramar, paramBoolean, paramInt1, paramString, paramInt2);
  }

  private ms(ar paramar, boolean paramBoolean1, int paramInt1, String paramString, int paramInt2, boolean paramBoolean2)
  {
    this(paramar, paramBoolean1, paramInt1, paramString, paramInt2, false, null, null, null);
  }

  public ms(ar paramar, boolean paramBoolean1, int paramInt1, String paramString1, int paramInt2, boolean paramBoolean2, String paramString2, String paramString3, String paramString4)
  {
    this(paramar, paramBoolean1, paramInt1, paramString1, paramInt2, paramBoolean2, paramString2, paramString3, paramString4, null);
  }

  public ms(ar paramar, boolean paramBoolean1, int paramInt1, String paramString1, int paramInt2, boolean paramBoolean2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(paramar, paramBoolean1, paramInt1, paramString1, paramInt2, paramBoolean2, paramString2, paramString3, paramString4, paramString5, null, null);
  }

  public ms(ar paramar, boolean paramBoolean1, int paramInt1, String paramString1, int paramInt2, boolean paramBoolean2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this.cMM = paramar;
    this.iWI = paramBoolean1;
    this.position = paramInt1;
    this.cDi = paramString1;
    this.fjl = paramInt2;
    this.juX = paramBoolean2;
    this.title = paramString2;
    this.cNM = paramString3;
    this.cNN = paramString4;
    this.juY = paramString5;
    this.cDa = paramString6;
    this.ddY = paramString7;
  }

  public ms(ar paramar, boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    this(paramar, paramBoolean, paramInt, paramString1, 0);
    this.cLi = paramString2;
  }

  public ms(String paramString)
  {
    this.cDi = paramString;
    this.fjl = 1;
  }

  public static ms Cr(String paramString)
  {
    ms localms = new ms();
    localms.fjl = 7;
    localms.ddY = paramString;
    return localms;
  }

  public static ms a(b paramb, ar paramar)
  {
    ms localms = new ms();
    localms.juZ = paramb;
    localms.cMM = paramar;
    return localms;
  }

  public static ms a(ar paramar, boolean paramBoolean, int paramInt)
  {
    ms localms = new ms();
    localms.cMM = paramar;
    localms.iWI = paramBoolean;
    localms.position = paramInt;
    localms.fjl = 0;
    localms.jva = false;
    return localms;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ms
 * JD-Core Version:    0.6.2
 */