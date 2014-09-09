package com.tencent.mm.network;

public class MMNativeNetComm$ReportInfo
{
  public long actionId = 0L;
  public long beginTime = 0L;
  public String clientIp = "";
  public long connCostTime = 0L;
  public long connTotalCostTime = 0L;
  public long dnsCostTime = 0L;
  public int dnsErrType = 0;
  public String dnsSvrIp = "";
  public int endFlag = 0;
  public int endStep = 0;
  public long endTime = 0L;
  public int errCode = 0;
  public int errType = 0;
  public long expand1 = 0L;
  public long expand2 = 0L;
  public String extraInfo = "";
  public long firstPkgTime = 0L;
  public String host = "";
  public String ip = "";
  public int ipType = 0;
  public boolean isSocket = false;
  public int localIp = 0;
  public long netSignal = 0L;
  public int netType = 0;
  public int newNetType = 0;
  public long newdnsCostTime = 0L;
  public int newdnsErrCode = 0;
  public int newdnsErrType = 0;
  public int port = 0;
  public long recvSize = 0L;
  public int refTime1 = 0;
  public int refTime2 = 0;
  public int refTime3 = 0;
  public int retryCount = 0;
  public long rtType = 0L;
  public long sendSize = 0L;
  public int subNetType = 0;
  public int usedIpIndex = 0;

  public String toString()
  {
    Object[] arrayOfObject = new Object[25];
    arrayOfObject[0] = Long.valueOf(this.actionId);
    arrayOfObject[1] = Long.valueOf(this.rtType);
    arrayOfObject[2] = Long.valueOf(this.beginTime);
    arrayOfObject[3] = Long.valueOf(this.endTime);
    arrayOfObject[4] = Long.valueOf(this.endTime - this.beginTime);
    arrayOfObject[5] = this.ip;
    arrayOfObject[6] = Integer.valueOf(this.port);
    arrayOfObject[7] = Boolean.valueOf(this.isSocket);
    arrayOfObject[8] = Integer.valueOf(this.netType);
    arrayOfObject[9] = Integer.valueOf(this.ipType);
    arrayOfObject[10] = Long.valueOf(this.sendSize);
    arrayOfObject[11] = Long.valueOf(this.recvSize);
    arrayOfObject[12] = Integer.valueOf(this.errType);
    arrayOfObject[13] = Integer.valueOf(this.errCode);
    arrayOfObject[14] = Long.valueOf(this.netSignal);
    arrayOfObject[15] = Integer.valueOf(this.retryCount);
    arrayOfObject[16] = Long.valueOf(this.expand1);
    arrayOfObject[17] = this.clientIp;
    arrayOfObject[18] = Long.valueOf(this.expand2);
    arrayOfObject[19] = Integer.valueOf(this.newNetType);
    arrayOfObject[20] = Integer.valueOf(this.subNetType);
    arrayOfObject[21] = this.extraInfo;
    arrayOfObject[22] = this.host;
    arrayOfObject[23] = Integer.valueOf(this.endStep);
    arrayOfObject[24] = Integer.valueOf(this.endFlag);
    return String.format("actionId:%d, rtType:%d, begin:%d, end:%d, cost:%d, ip:%s, port:%d, isSocket:%b, netType:%d, ipType:%d, sendSize:%d, recvSize:%d, errType:%d, errCode:%d, netSignal:%d, retryCount:%d, expand1:%d, clientip:%s, expand2:%d, newNetType:%d, subNetType:%d, extraInfo:%s, host:%s, endStep:%d, endFlag:%d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.MMNativeNetComm.ReportInfo
 * JD-Core Version:    0.6.2
 */