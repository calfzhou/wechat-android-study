package com.qq.a.a;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class c extends JceStruct
{
  protected HashMap Kr = new HashMap();
  private HashMap Ku = new HashMap(128);
  private HashMap Kv = new HashMap(128);
  protected String Kw = "GBK";
  JceInputStream Kx = new JceInputStream();

  static
  {
    if (!c.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  private void a(ArrayList paramArrayList, Object paramObject)
  {
    Object localObject1 = paramObject;
    while (localObject1.getClass().isArray())
    {
      if (!localObject1.getClass().getComponentType().toString().equals("byte"))
        throw new IllegalArgumentException("only byte[] is supported");
      if (Array.getLength(localObject1) > 0)
      {
        paramArrayList.add("java.util.List");
        localObject1 = Array.get(localObject1, 0);
      }
      else
      {
        paramArrayList.add("Array");
        paramArrayList.add("?");
        return;
      }
    }
    if ((localObject1 instanceof Array))
      throw new IllegalArgumentException("can not support Array, please use List");
    if ((localObject1 instanceof List))
    {
      paramArrayList.add("java.util.List");
      List localList = (List)localObject1;
      if (localList.size() > 0)
      {
        a(paramArrayList, localList.get(0));
        return;
      }
      paramArrayList.add("?");
      return;
    }
    if ((localObject1 instanceof Map))
    {
      paramArrayList.add("java.util.Map");
      Map localMap = (Map)localObject1;
      if (localMap.size() > 0)
      {
        Object localObject2 = localMap.keySet().iterator().next();
        Object localObject3 = localMap.get(localObject2);
        paramArrayList.add(localObject2.getClass().getName());
        a(paramArrayList, localObject3);
        return;
      }
      paramArrayList.add("?");
      paramArrayList.add("?");
      return;
    }
    paramArrayList.add(localObject1.getClass().getName());
  }

  public final void Q(String paramString)
  {
    this.Kw = paramString;
  }

  public void a(byte[] paramArrayOfByte)
  {
    this.Kx.warp(paramArrayOfByte);
    this.Kx.setServerEncoding(this.Kw);
    HashMap localHashMap1 = new HashMap(1);
    HashMap localHashMap2 = new HashMap(1);
    localHashMap2.put("", new byte[0]);
    localHashMap1.put("", localHashMap2);
    this.Kr = this.Kx.readMap(localHashMap1, 0, false);
  }

  public Object clone()
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

  public void display(StringBuilder paramStringBuilder, int paramInt)
  {
    new JceDisplayer(paramStringBuilder, paramInt).display(this.Kr, "_data");
  }

  public boolean equals(Object paramObject)
  {
    c localc = (c)paramObject;
    return JceUtil.equals(Integer.valueOf(1), localc.Kr);
  }

  public byte[] gO()
  {
    JceOutputStream localJceOutputStream = new JceOutputStream(0);
    localJceOutputStream.setServerEncoding(this.Kw);
    localJceOutputStream.write(this.Kr, 0);
    return JceUtil.getJceBufArray(localJceOutputStream.getByteBuffer());
  }

  public final Object get(String paramString)
  {
    if (!this.Kr.containsKey(paramString))
      return null;
    if (this.Kv.containsKey(paramString))
      return this.Kv.get(paramString);
    HashMap localHashMap = (HashMap)this.Kr.get(paramString);
    byte[] arrayOfByte1 = new byte[0];
    Iterator localIterator = localHashMap.entrySet().iterator();
    String str1;
    byte[] arrayOfByte2;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str2 = (String)localEntry.getKey();
      byte[] arrayOfByte3 = (byte[])localEntry.getValue();
      str1 = str2;
      arrayOfByte2 = arrayOfByte3;
    }
    while (true)
    {
      try
      {
        if (this.Ku.containsKey(str1))
        {
          localObject1 = this.Ku.get(str1);
          this.Kx.warp(arrayOfByte2);
          this.Kx.setServerEncoding(this.Kw);
          Object localObject2 = this.Kx.read(localObject1, 0, true);
          this.Kv.put(paramString, localObject2);
          return localObject2;
        }
      }
      catch (Exception localException)
      {
        throw new b(localException);
      }
      Object localObject1 = a.O(str1);
      this.Ku.put(str1, localObject1);
      continue;
      arrayOfByte2 = arrayOfByte1;
      str1 = null;
    }
  }

  public void put(String paramString, Object paramObject)
  {
    if (paramString == null)
      throw new IllegalArgumentException("put key can not is null");
    if (paramObject == null)
      throw new IllegalArgumentException("put value can not is null");
    if ((paramObject instanceof Set))
      throw new IllegalArgumentException("can not support Set");
    JceOutputStream localJceOutputStream = new JceOutputStream();
    localJceOutputStream.setServerEncoding(this.Kw);
    localJceOutputStream.write(paramObject, 0);
    byte[] arrayOfByte = JceUtil.getJceBufArray(localJceOutputStream.getByteBuffer());
    HashMap localHashMap = new HashMap(1);
    ArrayList localArrayList = new ArrayList(1);
    a(localArrayList, paramObject);
    localHashMap.put(a.a(localArrayList), arrayOfByte);
    this.Kv.remove(paramString);
    this.Kr.put(paramString, localHashMap);
  }

  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.Kr.clear();
    HashMap localHashMap = new HashMap();
    byte[] arrayOfByte = (byte[])new byte[1];
    Byte localByte = Byte.valueOf((byte)0);
    ((byte[])arrayOfByte)[0] = localByte.byteValue();
    localHashMap.put("", arrayOfByte);
    this.Kr.put("", localHashMap);
    this.Kr = ((HashMap)paramJceInputStream.read(this.Kr, 0, true));
  }

  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.Kr, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.a.a.c
 * JD-Core Version:    0.6.2
 */