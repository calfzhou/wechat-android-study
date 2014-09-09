package com.tencent.mm.network;

import android.os.IInterface;
import com.tencent.mm.protocal.c;
import com.tencent.mm.protocal.f;

public abstract interface ak extends IInterface
{
  public abstract void a(o paramo, int paramInt1, int paramInt2);

  public abstract void a(o paramo, y paramy, int paramInt1, int paramInt2);

  public abstract void b(o paramo, y paramy, int paramInt1, int paramInt2);

  public abstract void fp(String paramString);

  public abstract int getType();

  public abstract String getUri();

  public abstract c tN();

  public abstract f tO();

  public abstract int tl();

  public abstract boolean tm();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ak
 * JD-Core Version:    0.6.2
 */