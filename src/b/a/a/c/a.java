package b.a.a.c;

import com.tencent.mm.ao.b;
import java.io.OutputStream;
import java.util.LinkedList;

public final class a
{
  private final byte[] kiB;
  private final OutputStream kiC;
  private final b.a.a.b.b.a kiD;

  public a(byte[] paramArrayOfByte)
  {
    this.kiB = paramArrayOfByte;
    this.kiC = null;
    this.kiD = b.a.a.b.b.a.db(paramArrayOfByte);
  }

  public final void D(int paramInt, boolean paramBoolean)
  {
    this.kiD.C(paramInt, paramBoolean);
  }

  public final void I(int paramInt, String paramString)
  {
    this.kiD.I(paramInt, paramString);
  }

  public final void a(int paramInt, double paramDouble)
  {
    this.kiD.a(paramInt, paramDouble);
  }

  public final void b(int paramInt, LinkedList paramLinkedList)
  {
    int i = 0;
    b.a.a.b.b.a locala;
    int k;
    int j;
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      this.kiD.bw(paramInt, 2);
      locala = this.kiD;
      if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
        break label120;
      k = 0;
      j = 0;
      if (k < paramLinkedList.size())
        break label70;
    }
    while (true)
    {
      locala.rT(j);
      while (true)
      {
        if (i >= paramLinkedList.size())
        {
          return;
          label70: j += b.a.a.b.b.a.rX(((Integer)paramLinkedList.get(k)).intValue());
          k++;
          break;
        }
        this.kiD.rW(((Integer)paramLinkedList.get(i)).intValue());
        i++;
      }
      label120: j = 0;
    }
  }

  public final void beJ()
  {
    if (this.kiC != null)
    {
      this.kiC.write(this.kiB);
      this.kiC.flush();
    }
  }

  public final void bv(int paramInt1, int paramInt2)
  {
    this.kiD.bv(paramInt1, paramInt2);
  }

  public final void bx(int paramInt1, int paramInt2)
  {
    this.kiD.bu(paramInt1, paramInt2);
  }

  public final void by(int paramInt1, int paramInt2)
  {
    bx(paramInt1, paramInt2);
  }

  public final void c(int paramInt, float paramFloat)
  {
    this.kiD.c(paramInt, paramFloat);
  }

  public final void c(int paramInt, b paramb)
  {
    this.kiD.b(paramInt, paramb);
  }

  public final void d(int paramInt1, int paramInt2, LinkedList paramLinkedList)
  {
    int i3;
    if (paramLinkedList != null)
      switch (paramInt2)
      {
      default:
        throw new IllegalArgumentException("The data type was not found, the id used was " + paramInt2);
      case 6:
        i3 = 0;
        if (i3 < paramLinkedList.size())
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
      return;
      c(paramInt1, (b)paramLinkedList.get(i3));
      i3++;
      break;
      for (int i2 = 0; i2 < paramLinkedList.size(); i2++)
        a(paramInt1, ((Double)paramLinkedList.get(i2)).doubleValue());
      continue;
      for (int i1 = 0; i1 < paramLinkedList.size(); i1++)
        c(paramInt1, ((Float)paramLinkedList.get(i1)).floatValue());
      continue;
      for (int n = 0; n < paramLinkedList.size(); n++)
        bx(paramInt1, ((Integer)paramLinkedList.get(n)).intValue());
      continue;
      for (int m = 0; m < paramLinkedList.size(); m++)
        k(paramInt1, ((Long)paramLinkedList.get(m)).longValue());
      continue;
      for (int k = 0; k < paramLinkedList.size(); k++)
        I(paramInt1, (String)paramLinkedList.get(k));
      continue;
      for (int j = 0; j < paramLinkedList.size(); j++)
        D(paramInt1, ((Boolean)paramLinkedList.get(j)).booleanValue());
      continue;
      for (int i = 0; i < paramLinkedList.size(); i++)
      {
        com.tencent.mm.ao.a locala = (com.tencent.mm.ao.a)paramLinkedList.get(i);
        bv(paramInt1, locala.hD());
        locala.a(this);
      }
    }
  }

  public final void k(int paramInt, long paramLong)
  {
    this.kiD.j(paramInt, paramLong);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     b.a.a.c.a
 * JD-Core Version:    0.6.2
 */