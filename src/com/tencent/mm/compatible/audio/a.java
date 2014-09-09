package com.tencent.mm.compatible.audio;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a
{
  private int dJA = 0;
  private int dJB = 0;
  private byte[] dJC = null;
  private int dJD = 0;
  private int dJE = 0;
  private boolean dJF = false;
  private Lock dJG = null;

  public final int bZ(int paramInt)
  {
    if (paramInt <= 0);
    do
    {
      return -1;
      this.dJC = new byte[paramInt];
    }
    while (this.dJC == null);
    this.dJA = paramInt;
    if (this.dJF)
      this.dJG = new ReentrantLock();
    return 0;
  }

  public final int c(byte[] paramArrayOfByte, int paramInt)
  {
    int i;
    if (paramInt > 0)
    {
      if (this.dJF)
        this.dJG.lock();
      if (this.dJD != this.dJE)
        break label43;
      i = this.dJA;
      if (paramInt <= i)
        break label151;
    }
    label43: 
    while ((paramInt + this.dJE) % this.dJA == this.dJD)
    {
      return -1;
      if ((1 + this.dJE) % this.dJA == this.dJD)
      {
        i = 0;
        break;
      }
      if (this.dJD < this.dJE)
        this.dJB = (this.dJE - this.dJD);
      while (true)
      {
        if (this.dJF)
          this.dJG.unlock();
        i = this.dJA - this.dJB;
        break;
        if (this.dJD > this.dJE)
          this.dJB = (this.dJE + this.dJA - this.dJD);
      }
    }
    label151: if (this.dJF)
      this.dJG.lock();
    if ((this.dJD < this.dJE) && (paramInt > this.dJA - this.dJE))
    {
      System.arraycopy(paramArrayOfByte, 0, this.dJC, this.dJE, this.dJA - this.dJE);
      System.arraycopy(paramArrayOfByte, this.dJA - this.dJE, this.dJC, 0, paramInt - (this.dJA - this.dJE));
      this.dJE = (paramInt - (this.dJA - this.dJE));
    }
    for (this.dJE %= this.dJA; ; this.dJE = ((paramInt + this.dJE) % this.dJA))
    {
      if (this.dJF)
        this.dJG.unlock();
      return 0;
      System.arraycopy(paramArrayOfByte, 0, this.dJC, this.dJE, paramInt);
    }
  }

  public final int d(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > mk()) || (paramArrayOfByte == null));
    while (this.dJD == this.dJE)
      return -1;
    if (this.dJF)
      this.dJG.lock();
    if (this.dJD < this.dJE)
    {
      System.arraycopy(this.dJC, this.dJD, paramArrayOfByte, 0, paramInt);
      this.dJD = (paramInt + this.dJD);
    }
    while (true)
    {
      if (this.dJF)
        this.dJG.unlock();
      return 0;
      if (paramInt <= this.dJA - this.dJD)
      {
        System.arraycopy(this.dJC, this.dJD, paramArrayOfByte, 0, paramInt);
        this.dJD = (paramInt + this.dJD);
      }
      else
      {
        System.arraycopy(this.dJC, this.dJD, paramArrayOfByte, 0, this.dJA - this.dJD);
        System.arraycopy(this.dJC, 0, paramArrayOfByte, this.dJA - this.dJD, paramInt - (this.dJA - this.dJD));
        this.dJD = (paramInt - (this.dJA - this.dJD));
      }
    }
  }

  public final int mg()
  {
    this.dJA = 0;
    this.dJB = 0;
    this.dJD = 0;
    this.dJE = 0;
    this.dJC = null;
    return 0;
  }

  public final int mi()
  {
    return this.dJA;
  }

  public final int mk()
  {
    if (this.dJF)
      this.dJG.lock();
    if (this.dJD == this.dJE)
      return 0;
    if (this.dJD < this.dJE)
      this.dJB = (this.dJE - this.dJD);
    while (true)
    {
      if (this.dJF)
        this.dJG.unlock();
      return this.dJB;
      if (this.dJD > this.dJE)
        this.dJB = (this.dJE + this.dJA - this.dJD);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.a
 * JD-Core Version:    0.6.2
 */