package com.tencent.mm.storage;

public final class r extends com.tencent.mm.h.a
  implements com.tencent.mm.dbsupport.newcursor.a
{
  public r()
  {
  }

  public r(String paramString)
  {
    super(paramString);
  }

  private void h(int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    case 4:
    case 5:
    case 6:
    case 8:
    case 9:
    default:
      return;
    case 0:
      bt((int)paramLong);
      return;
    case 1:
      setStatus((int)paramLong);
      return;
    case 2:
      bv((int)paramLong);
      return;
    case 3:
      k(paramLong);
      return;
    case 7:
      l(paramLong);
      return;
    case 10:
    }
    by((int)paramLong);
  }

  public final void a(int paramInt, long paramLong)
  {
    h(paramInt, paramLong);
  }

  public final void aIB()
  {
    setStatus(0);
    bv(0);
    setContent("");
    bv("0");
    bt(0);
    super.bu("");
    super.bw("");
  }

  public final void b(int paramInt, long paramLong)
  {
    h(paramInt, paramLong);
  }

  public final void c(int paramInt, byte[] paramArrayOfByte)
  {
  }

  public final void f(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    case 7:
    case 10:
    default:
      return;
    case 4:
      setUsername(paramString);
      return;
    case 5:
      setContent(paramString);
      return;
    case 6:
      bv(paramString);
      return;
    case 8:
      bu(paramString);
      return;
    case 9:
      bw(paramString);
      return;
    case 11:
    }
    by(paramString);
  }

  public final void og()
  {
  }

  public final void v(ar paramar)
  {
    setStatus(paramar.getStatus());
    bv(paramar.jK());
    if (paramar.getStatus() == 1);
    for (long l = 9223372036854775807L; ; l = paramar.kn())
    {
      k(l);
      setContent(paramar.getContent());
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.r
 * JD-Core Version:    0.6.2
 */