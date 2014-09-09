package com.tencent.mm.network.a;

public final class b
{
  public long beginTime = 0L;
  public String clientIp = "";
  public long dDR = 0L;
  public long dUA = 0L;
  public long dUB = 0L;
  public f dUs;
  public boolean dUt = false;
  public long dUu = 0L;
  public long dUv = 0L;
  public long dUw = 0L;
  public int dUx = 0;
  public int dUy = 0;
  public long dUz = 0L;
  public long endTime = 0L;
  public int errCode = 0;
  public int errType = 0;
  public long expand1 = 0L;
  public long expand2 = 0L;
  public String host;
  public long netSignal = 0L;
  public int netType = 0;
  public int retryCount = 0;
  public long rtType = 0L;

  public final String toString()
  {
    Object[] arrayOfObject = new Object[13];
    arrayOfObject[0] = Long.valueOf(this.rtType);
    arrayOfObject[1] = Long.valueOf(this.beginTime);
    arrayOfObject[2] = Long.valueOf(this.endTime);
    arrayOfObject[3] = Long.valueOf(this.endTime - this.beginTime);
    arrayOfObject[4] = Long.valueOf(this.dDR);
    arrayOfObject[5] = Long.valueOf(this.dUw);
    if (this.dUs == null);
    for (String str = "null"; ; str = this.dUs.toString())
    {
      arrayOfObject[6] = str;
      arrayOfObject[7] = Boolean.valueOf(this.dUt);
      arrayOfObject[8] = Integer.valueOf(this.netType);
      arrayOfObject[9] = Integer.valueOf(this.errType);
      arrayOfObject[10] = Integer.valueOf(this.errCode);
      arrayOfObject[11] = Long.valueOf(this.dUu);
      arrayOfObject[12] = Long.valueOf(this.dUv);
      return String.format("rtType:%d begin:%d, end:%d time:%d cost:%d count:%d ipInfo:%s socket:%b netType:%d err:(%d,%d) tx:%d rx:%d", arrayOfObject);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.a.b
 * JD-Core Version:    0.6.2
 */