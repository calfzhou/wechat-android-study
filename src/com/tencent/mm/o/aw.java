package com.tencent.mm.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.a.f;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import oicq.wlogin_sdk.a.b;
import oicq.wlogin_sdk.a.d;
import oicq.wlogin_sdk.a.e;

public final class aw
{
  private d dpB = null;
  private long dpC = 0L;

  public aw()
  {
    try
    {
      long l = ch.CM();
      this.dpB = new d(ak.getContext(), a.hrn);
      oicq.wlogin_sdk.c.f.klL = 1;
      oicq.wlogin_sdk.c.f.klM = new ax(this);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(ch.ac(l));
      z.d("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkstart wtlogin init :%d", arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", localException, "Failed initializing WtloginMgr.", new Object[0]);
    }
  }

  public static int fr(String paramString)
  {
    if (ch.jb(paramString));
    SharedPreferences localSharedPreferences;
    do
    {
      return -1;
      localSharedPreferences = ak.getContext().getSharedPreferences("next_auth_pass_type", 0);
    }
    while (localSharedPreferences == null);
    return localSharedPreferences.getInt(f.d(paramString.getBytes()), 0);
  }

  public static void m(String paramString, int paramInt)
  {
    if (ch.jb(paramString))
      return;
    SharedPreferences.Editor localEditor = ak.getContext().getSharedPreferences("next_auth_pass_type", 0).edit();
    localEditor.putInt(f.d(paramString.getBytes()), paramInt);
    localEditor.commit();
  }

  public final byte[] C(long paramLong)
  {
    if (paramLong != this.dpC)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(this.dpC);
      arrayOfObject2[1] = Long.valueOf(paramLong);
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt getVerifyImg Error uin ReqUin:%d RespUin:%d", arrayOfObject2);
      return new byte[0];
    }
    try
    {
      byte[] arrayOfByte = this.dpB.dq(paramLong);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException.getMessage();
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt getVerifyImg e:%s", arrayOfObject1);
    }
    return new byte[0];
  }

  public final byte[] D(long paramLong)
  {
    if (paramLong != this.dpC)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(this.dpC);
      arrayOfObject2[1] = Long.valueOf(paramLong);
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt getA2KeyByRespBuf Error uin ReqUin:%d RespUin:%d", arrayOfObject2);
      return new byte[0];
    }
    try
    {
      b localb = this.dpB.dr(paramLong);
      if (localb == null)
        return new byte[0];
      byte[] arrayOfByte = localb.kiS;
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException.getMessage();
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt getA2KeyByRespBuf e:%s", arrayOfObject1);
    }
    return new byte[0];
  }

  public final void E(long paramLong)
  {
    if (paramLong != this.dpC)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(this.dpC);
      arrayOfObject2[1] = Long.valueOf(paramLong);
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt clearUserWtInfo Error uin ReqUin:%d RespUin:%d", arrayOfObject2);
      return;
    }
    try
    {
      this.dpB.ds(paramLong);
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException.getMessage();
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt clearUserWtInfo e:%s", arrayOfObject1);
    }
  }

  public final boolean a(long paramLong, byte[] paramArrayOfByte)
  {
    if (paramLong != this.dpC)
    {
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Long.valueOf(this.dpC);
      arrayOfObject3[1] = Long.valueOf(paramLong);
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt parseRespLoginBuf Error uin ReqUin:%d RespUin:%d", arrayOfObject3);
    }
    while (true)
    {
      return false;
      if (ch.B(paramArrayOfByte))
      {
        z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt parseRespLoginBuf respBuf is null.");
        return false;
      }
      try
      {
        int i = this.dpB.dd(paramArrayOfByte);
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(paramArrayOfByte.length);
        arrayOfObject2[1] = Integer.valueOf(i);
        z.d("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt parseRespLoginBuf buflen:%d ret:%d", arrayOfObject2);
        if (i == 0)
          return true;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt parseRespLoginBuf e:%s", arrayOfObject1);
      }
    }
    return false;
  }

  public final byte[] a(long paramLong, String paramString)
  {
    if (paramLong != this.dpC)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(this.dpC);
      arrayOfObject2[1] = Long.valueOf(paramLong);
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt getReqLoginBufbyVerifyImg Error uin ReqUin:%d RespUin:%d", arrayOfObject2);
      return new byte[0];
    }
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt getReqLoginBufbyVerifyImg Error imgResult is null.");
      return new byte[0];
    }
    try
    {
      byte[] arrayOfByte = this.dpB.h(paramLong, paramString.getBytes());
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException.getMessage();
      z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt getReqLoginBufbyVerifyImg e:%s", arrayOfObject1);
    }
    return new byte[0];
  }

  public final byte[] a(long paramLong, String paramString, boolean paramBoolean)
  {
    Object[] arrayOfObject1 = new Object[2];
    boolean bool1;
    Object localObject;
    if (ao.dVY == 10006)
    {
      bool1 = true;
      arrayOfObject1[0] = Boolean.valueOf(bool1);
      arrayOfObject1[1] = Integer.valueOf(ao.dVZ);
      z.d("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt isTestWtLogin:%b val:%d", arrayOfObject1);
      if (ao.dVY != 10006)
        break label91;
      if (ao.dVZ != 1)
        break label80;
      ao.dVZ = 0;
      localObject = new byte[0];
    }
    while (true)
    {
      return localObject;
      bool1 = false;
      break;
      label80: if (ao.dVZ == 2)
        return new byte[0];
      try
      {
        label91: this.dpC = paramLong;
        label104: Object[] arrayOfObject3;
        if (paramBoolean)
        {
          localObject = null;
          arrayOfObject3 = new Object[4];
          arrayOfObject3[0] = Integer.valueOf(8256);
          arrayOfObject3[1] = Long.valueOf(paramLong);
          arrayOfObject3[2] = Boolean.valueOf(paramBoolean);
          if (ch.B((byte[])localObject))
            break label221;
        }
        label221: for (boolean bool2 = true; ; bool2 = false)
        {
          arrayOfObject3[3] = Boolean.valueOf(bool2);
          z.d("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt getReqLoginBuf sig:%d uin:%d manualauth:%b  byA1Buf:%b ", arrayOfObject3);
          if (!ch.B((byte[])localObject))
            break;
          return this.dpB.a(paramLong, e.kjm, new String(ch.jg(paramString), "ISO-8859-1"));
          byte[] arrayOfByte = this.dpB.a(paramLong, e.kjn, "");
          localObject = arrayOfByte;
          break label104;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R", "dkwt getReqLoginBuf e:%s", arrayOfObject2);
      }
    }
    return new byte[0];
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.aw
 * JD-Core Version:    0.6.2
 */