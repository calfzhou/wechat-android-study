package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.ao.a;
import com.tencent.mm.plugin.exdevice.c.e;

public abstract class d
{
  private short eIi = -1;
  private e eIj = null;
  protected a eIk = null;
  private long ejo = -1L;

  public final long HW()
  {
    return this.ejo;
  }

  public abstract short OL();

  public abstract short OM();

  public final short ON()
  {
    return this.eIi;
  }

  public abstract byte[] OO();

  public final e OP()
  {
    return this.eIj;
  }

  protected final void a(short paramShort)
  {
    this.eIi = paramShort;
  }

  protected final void an(long paramLong)
  {
    this.ejo = paramLong;
  }

  protected final e k(int paramInt, String paramString)
  {
    this.eIj = new e();
    this.eIj.eJz = paramInt;
    this.eIj.eJA = paramString;
    return this.eIj;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.d
 * JD-Core Version:    0.6.2
 */