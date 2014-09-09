package com.qq.taf.jce.dynamic;

import com.qq.taf.jce.JceDecodeException;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceInputStream.HeadData;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class DynamicInputStream
{
  private ByteBuffer bs;
  private String sServerEncoding = "GBK";

  public DynamicInputStream(ByteBuffer paramByteBuffer)
  {
    this.bs = paramByteBuffer;
  }

  public DynamicInputStream(byte[] paramArrayOfByte)
  {
    this.bs = ByteBuffer.wrap(paramArrayOfByte);
  }

  private JceField readString(JceInputStream.HeadData paramHeadData, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.bs.get(arrayOfByte);
    try
    {
      str = new String(arrayOfByte, this.sServerEncoding);
      return JceField.create(str, paramHeadData.tag);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        String str = new String(arrayOfByte);
    }
  }

  public final JceField read()
  {
    int i = 0;
    try
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      JceInputStream.readHead(localHeadData, this.bs);
      switch (localHeadData.type)
      {
      case 0:
        return JceField.create(this.bs.get(), localHeadData.tag);
      case 1:
        return JceField.create(this.bs.getShort(), localHeadData.tag);
      case 2:
        return JceField.create(this.bs.getInt(), localHeadData.tag);
      case 3:
        return JceField.create(this.bs.getLong(), localHeadData.tag);
      case 4:
        return JceField.create(this.bs.getFloat(), localHeadData.tag);
      case 5:
        return JceField.create(this.bs.getDouble(), localHeadData.tag);
      case 6:
        int i1 = this.bs.get();
        if (i1 < 0)
          i1 += 256;
        return readString(localHeadData, i1);
      case 7:
        return readString(localHeadData, this.bs.getInt());
      case 9:
        int n = ((NumberField)read()).intValue();
        JceField[] arrayOfJceField3 = new JceField[n];
        while (true)
        {
          if (i >= n)
            return JceField.createList(arrayOfJceField3, localHeadData.tag);
          arrayOfJceField3[i] = read();
          i++;
        }
      case 8:
        int k = ((NumberField)read()).intValue();
        JceField[] arrayOfJceField1 = new JceField[k];
        JceField[] arrayOfJceField2 = new JceField[k];
        for (int m = 0; ; m++)
        {
          if (m >= k)
            return JceField.createMap(arrayOfJceField1, arrayOfJceField2, localHeadData.tag);
          arrayOfJceField1[m] = read();
          arrayOfJceField2[m] = read();
        }
      case 10:
        ArrayList localArrayList = new ArrayList();
        while (true)
        {
          JceField localJceField2 = read();
          if (localJceField2 == null)
            break;
          localArrayList.add(localJceField2);
        }
        return JceField.createStruct((JceField[])localArrayList.toArray(new JceField[0]), localHeadData.tag);
      case 12:
        return JceField.createZero(localHeadData.tag);
      case 13:
        int j = localHeadData.tag;
        JceInputStream.readHead(localHeadData, this.bs);
        if (localHeadData.type != 0)
          throw new JceDecodeException("type mismatch, simple_list only support byte, tag: " + j + ", type: " + localHeadData.type);
        byte[] arrayOfByte = new byte[((NumberField)read()).intValue()];
        this.bs.get(arrayOfByte);
        JceField localJceField1 = JceField.create(arrayOfByte, j);
        return localJceField1;
      default:
        return null;
      case 11:
      }
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      return null;
    }
    return null;
  }

  public final int setServerEncoding(String paramString)
  {
    this.sServerEncoding = paramString;
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.DynamicInputStream
 * JD-Core Version:    0.6.2
 */