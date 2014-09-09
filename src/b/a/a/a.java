package b.a.a;

import com.tencent.mm.ao.b;
import java.util.LinkedList;

public final class a
{
  public static int a(int paramInt, b paramb)
  {
    if (paramb == null)
      return 0;
    return b.a.a.b.b.a.rV(paramInt) + b.a.a.b.b.a.rX(paramb.size()) + paramb.size();
  }

  public static int a(int paramInt, LinkedList paramLinkedList)
  {
    int i = 0;
    int k;
    int m;
    if (paramLinkedList != null)
    {
      int j = paramLinkedList.size();
      i = 0;
      if (j > 0)
      {
        k = 0;
        m = 0;
      }
    }
    while (true)
    {
      if (k >= paramLinkedList.size())
      {
        i = m + b.a.a.b.b.a.rX(m) + b.a.a.b.b.a.rV(paramInt);
        return i;
      }
      m += b.a.a.b.b.a.rX(((Integer)paramLinkedList.get(k)).intValue());
      k++;
    }
  }

  public static int br(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
      return b.a.a.b.b.a.rV(paramInt1) + b.a.a.b.b.a.rX(paramInt2);
    return 10 + b.a.a.b.b.a.rV(paramInt1);
  }

  public static int bs(int paramInt1, int paramInt2)
  {
    return paramInt2 + (b.a.a.b.b.a.rV(paramInt1) + b.a.a.b.b.a.rX(paramInt2));
  }

  public static int c(int paramInt1, int paramInt2, LinkedList paramLinkedList)
  {
    if (paramLinkedList != null)
    {
      int i4;
      int j;
      switch (paramInt2)
      {
      default:
        throw new IllegalArgumentException("The data type was not found, the id used was " + paramInt2);
      case 6:
        i4 = 0;
        j = 0;
        if (i4 < paramLinkedList.size())
          break;
      case 4:
      case 5:
      case 2:
      case 3:
      case 1:
      case 7:
      case 8:
      }
      while (true)
      {
        return j;
        j += a(paramInt1, (b)paramLinkedList.get(i4));
        i4++;
        break;
        int i3 = 0;
        j = 0;
        while (i3 < paramLinkedList.size())
        {
          ((Double)paramLinkedList.get(i3)).doubleValue();
          j += 8 + b.a.a.b.b.a.rV(paramInt1);
          i3++;
        }
        int i2 = 0;
        j = 0;
        while (i2 < paramLinkedList.size())
        {
          ((Float)paramLinkedList.get(i2)).floatValue();
          j += 4 + b.a.a.b.b.a.rV(paramInt1);
          i2++;
        }
        int i1 = 0;
        j = 0;
        while (i1 < paramLinkedList.size())
        {
          j += br(paramInt1, ((Integer)paramLinkedList.get(i1)).intValue());
          i1++;
        }
        int n = 0;
        j = 0;
        while (n < paramLinkedList.size())
        {
          j += i(paramInt1, ((Long)paramLinkedList.get(n)).longValue());
          n++;
        }
        int m = 0;
        j = 0;
        while (m < paramLinkedList.size())
        {
          j += b.a.a.b.b.a.J(paramInt1, (String)paramLinkedList.get(m));
          m++;
        }
        int k = 0;
        j = 0;
        while (k < paramLinkedList.size())
        {
          ((Boolean)paramLinkedList.get(k)).booleanValue();
          j += 1 + b.a.a.b.b.a.rV(paramInt1);
          k++;
        }
        int i = 0;
        j = 0;
        while (i < paramLinkedList.size())
        {
          j += bs(paramInt1, ((com.tencent.mm.ao.a)paramLinkedList.get(i)).hD());
          i++;
        }
      }
    }
    return 0;
  }

  public static int i(int paramInt, long paramLong)
  {
    int i = b.a.a.b.b.a.rV(paramInt);
    int j;
    if ((0xFFFFFF80 & paramLong) == 0L)
      j = 1;
    while (true)
    {
      return j + i;
      if ((0xFFFFC000 & paramLong) == 0L)
        j = 2;
      else if ((0xFFE00000 & paramLong) == 0L)
        j = 3;
      else if ((0xF0000000 & paramLong) == 0L)
        j = 4;
      else if ((0x0 & paramLong) == 0L)
        j = 5;
      else if ((0x0 & paramLong) == 0L)
        j = 6;
      else if ((0x0 & paramLong) == 0L)
        j = 7;
      else if ((0x0 & paramLong) == 0L)
        j = 8;
      else if ((0x0 & paramLong) == 0L)
        j = 9;
      else
        j = 10;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     b.a.a.a
 * JD-Core Version:    0.6.2
 */