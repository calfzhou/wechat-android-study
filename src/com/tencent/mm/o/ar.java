package com.tencent.mm.o;

import com.tencent.mm.network.aj;
import com.tencent.mm.network.al;
import com.tencent.mm.network.o;
import com.tencent.mm.network.y;
import com.tencent.mm.protocal.c;
import com.tencent.mm.protocal.f;
import com.tencent.mm.sdk.platformtools.cm;

public final class ar extends al
{
  private aj dpk;
  c dps;
  f dpt;
  cm gQj;

  public ar(aj paramaj)
  {
    this(paramaj, new cm());
  }

  public ar(aj paramaj, cm paramcm)
  {
    this.dpk = paramaj;
    this.dps = new aq(paramaj.tk(), paramaj.getType());
    this.dpt = new av(paramaj.sS(), paramaj.getType());
    this.gQj = paramcm;
  }

  public final void a(o paramo, int paramInt1, int paramInt2)
  {
    this.gQj.post(new as(this, paramInt1, paramInt2));
  }

  public final void a(o paramo, y paramy, int paramInt1, int paramInt2)
  {
    this.gQj.post(new at(this, paramo, paramy, paramInt1, paramInt2));
  }

  public final void b(o paramo, y paramy, int paramInt1, int paramInt2)
  {
    this.gQj.post(new au(this, paramy, paramInt1, paramInt2));
  }

  public final void fp(String paramString)
  {
  }

  public final int getType()
  {
    return this.dpk.getType();
  }

  public final String getUri()
  {
    return this.dpk.getUri();
  }

  public final c tN()
  {
    return this.dps;
  }

  public final f tO()
  {
    return this.dpt;
  }

  public final int tl()
  {
    return this.dpk.tl();
  }

  public final boolean tm()
  {
    return this.dpk.tm();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.ar
 * JD-Core Version:    0.6.2
 */