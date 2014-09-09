package com.qq.taf;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.HashMap;
import java.util.Map;

public final class RequestPacket extends JceStruct
{
  static Map cache_context;
  static byte[] cache_sBuffer;
  public byte cPacketType = 0;
  public Map context;
  public int iMessageType = 0;
  public int iRequestId = 0;
  public int iTimeout = 0;
  public short iVersion = 0;
  public byte[] sBuffer;
  public String sFuncName = null;
  public String sServantName = null;
  public Map status;

  static
  {
    if (!RequestPacket.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      cache_sBuffer = null;
      cache_context = null;
      return;
    }
  }

  public RequestPacket()
  {
  }

  public RequestPacket(short paramShort, byte paramByte, int paramInt1, int paramInt2, String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt3, Map paramMap1, Map paramMap2)
  {
    this.iVersion = paramShort;
    this.cPacketType = paramByte;
    this.iMessageType = paramInt1;
    this.iRequestId = paramInt2;
    this.sServantName = paramString1;
    this.sFuncName = paramString2;
    this.sBuffer = paramArrayOfByte;
    this.iTimeout = paramInt3;
    this.context = paramMap1;
    this.status = paramMap2;
  }

  public final Object clone()
  {
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
      return localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      boolean bool;
      do
      {
        bool = $assertionsDisabled;
        Object localObject1 = null;
      }
      while (bool);
    }
    throw new AssertionError();
  }

  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    JceDisplayer localJceDisplayer = new JceDisplayer(paramStringBuilder, paramInt);
    localJceDisplayer.display(this.iVersion, "iVersion");
    localJceDisplayer.display(this.cPacketType, "cPacketType");
    localJceDisplayer.display(this.iMessageType, "iMessageType");
    localJceDisplayer.display(this.iRequestId, "iRequestId");
    localJceDisplayer.display(this.sServantName, "sServantName");
    localJceDisplayer.display(this.sFuncName, "sFuncName");
    localJceDisplayer.display(this.sBuffer, "sBuffer");
    localJceDisplayer.display(this.iTimeout, "iTimeout");
    localJceDisplayer.display(this.context, "context");
    localJceDisplayer.display(this.status, "status");
  }

  public final boolean equals(Object paramObject)
  {
    RequestPacket localRequestPacket = (RequestPacket)paramObject;
    return (JceUtil.equals(1, localRequestPacket.iVersion)) && (JceUtil.equals(1, localRequestPacket.cPacketType)) && (JceUtil.equals(1, localRequestPacket.iMessageType)) && (JceUtil.equals(1, localRequestPacket.iRequestId)) && (JceUtil.equals(Integer.valueOf(1), localRequestPacket.sServantName)) && (JceUtil.equals(Integer.valueOf(1), localRequestPacket.sFuncName)) && (JceUtil.equals(Integer.valueOf(1), localRequestPacket.sBuffer)) && (JceUtil.equals(1, localRequestPacket.iTimeout)) && (JceUtil.equals(Integer.valueOf(1), localRequestPacket.context)) && (JceUtil.equals(Integer.valueOf(1), localRequestPacket.status));
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    try
    {
      this.iVersion = paramJceInputStream.read(this.iVersion, 1, true);
      this.cPacketType = paramJceInputStream.read(this.cPacketType, 2, true);
      this.iMessageType = paramJceInputStream.read(this.iMessageType, 3, true);
      this.iRequestId = paramJceInputStream.read(this.iRequestId, 4, true);
      this.sServantName = paramJceInputStream.readString(5, true);
      this.sFuncName = paramJceInputStream.readString(6, true);
      if (cache_sBuffer == null)
        cache_sBuffer = new byte[1];
      this.sBuffer = paramJceInputStream.read(cache_sBuffer, 7, true);
      this.iTimeout = paramJceInputStream.read(this.iTimeout, 8, true);
      if (cache_context == null)
      {
        HashMap localHashMap1 = new HashMap();
        cache_context = localHashMap1;
        localHashMap1.put("", "");
      }
      this.context = ((Map)paramJceInputStream.read(cache_context, 9, true));
      if (cache_context == null)
      {
        HashMap localHashMap2 = new HashMap();
        cache_context = localHashMap2;
        localHashMap2.put("", "");
      }
      this.status = ((Map)paramJceInputStream.read(cache_context, 10, true));
      return;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.iVersion, 1);
    paramJceOutputStream.write(this.cPacketType, 2);
    paramJceOutputStream.write(this.iMessageType, 3);
    paramJceOutputStream.write(this.iRequestId, 4);
    paramJceOutputStream.write(this.sServantName, 5);
    paramJceOutputStream.write(this.sFuncName, 6);
    paramJceOutputStream.write(this.sBuffer, 7);
    paramJceOutputStream.write(this.iTimeout, 8);
    paramJceOutputStream.write(this.context, 9);
    paramJceOutputStream.write(this.status, 10);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.RequestPacket
 * JD-Core Version:    0.6.2
 */