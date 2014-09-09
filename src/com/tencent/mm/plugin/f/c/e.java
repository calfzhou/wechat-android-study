package com.tencent.mm.plugin.f.c;

import com.tencent.mm.kvcomm.KVReportJni.KVReportJava2C;

public final class e
{
  public static void a(int paramInt1, int paramInt2, int paramInt3, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      KVReportJni.KVReportJava2C.writeImportKvData(paramInt1, paramInt2, paramInt3, 1, paramString, paramBoolean1);
      return;
    }
    KVReportJni.KVReportJava2C.writeKvData(paramInt1, paramInt2, paramInt3, 1, paramString, paramBoolean1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.e
 * JD-Core Version:    0.6.2
 */