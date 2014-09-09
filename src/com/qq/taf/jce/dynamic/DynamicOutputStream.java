package com.qq.taf.jce.dynamic;

import com.qq.taf.jce.JceDecodeException;
import com.qq.taf.jce.JceOutputStream;
import java.nio.ByteBuffer;

public final class DynamicOutputStream extends JceOutputStream
{
  public DynamicOutputStream()
  {
  }

  public DynamicOutputStream(int paramInt)
  {
    super(paramInt);
  }

  public DynamicOutputStream(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }

  public final void write(JceField paramJceField)
  {
    int i = 0;
    int j = paramJceField.getTag();
    if ((paramJceField instanceof ZeroField))
      write(0, j);
    while (true)
    {
      return;
      if ((paramJceField instanceof IntField))
      {
        write(((IntField)paramJceField).get(), j);
        return;
      }
      if ((paramJceField instanceof ShortField))
      {
        write(((ShortField)paramJceField).get(), j);
        return;
      }
      if ((paramJceField instanceof ByteField))
      {
        write(((ByteField)paramJceField).get(), j);
        return;
      }
      if ((paramJceField instanceof StringField))
      {
        write(((StringField)paramJceField).get(), j);
        return;
      }
      if ((paramJceField instanceof ByteArrayField))
      {
        write(((ByteArrayField)paramJceField).get(), j);
        return;
      }
      if ((paramJceField instanceof ListField))
      {
        ListField localListField = (ListField)paramJceField;
        reserve(8);
        writeHead((byte)9, j);
        write(localListField.size(), 0);
        JceField[] arrayOfJceField2 = localListField.get();
        int i1 = arrayOfJceField2.length;
        while (i < i1)
        {
          write(arrayOfJceField2[i]);
          i++;
        }
      }
      else
      {
        if (!(paramJceField instanceof MapField))
          break;
        MapField localMapField = (MapField)paramJceField;
        reserve(8);
        writeHead((byte)8, j);
        int n = localMapField.size();
        write(n, 0);
        while (i < n)
        {
          write(localMapField.getKey(i));
          write(localMapField.getValue(i));
          i++;
        }
      }
    }
    if ((paramJceField instanceof StructField))
    {
      StructField localStructField = (StructField)paramJceField;
      reserve(2);
      writeHead((byte)10, j);
      JceField[] arrayOfJceField1 = localStructField.get();
      int k = arrayOfJceField1.length;
      for (int m = 0; ; m++)
      {
        if (m >= k)
        {
          reserve(2);
          writeHead((byte)11, 0);
          return;
        }
        write(arrayOfJceField1[m]);
      }
    }
    if ((paramJceField instanceof LongField))
    {
      write(((LongField)paramJceField).get(), j);
      return;
    }
    if ((paramJceField instanceof FloatField))
    {
      write(((FloatField)paramJceField).get(), j);
      return;
    }
    if ((paramJceField instanceof DoubleField))
    {
      write(((DoubleField)paramJceField).get(), j);
      return;
    }
    throw new JceDecodeException("unknow JceField type: " + paramJceField.getClass().getName());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.DynamicOutputStream
 * JD-Core Version:    0.6.2
 */