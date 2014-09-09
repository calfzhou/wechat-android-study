package b.a.a.a;

import java.util.LinkedList;

public final class a
{
  private final b.a.a.a.a.b hre;
  private final b.a.a.b.a.a kiq;
  private int kir = 0;

  public a(byte[] paramArrayOfByte, b.a.a.a.a.b paramb)
  {
    this.kiq = b.a.a.b.a.a.da(paramArrayOfByte);
    this.hre = paramb;
  }

  public final int bek()
  {
    return this.kiq.bex();
  }

  public final int bel()
  {
    return this.kiq.bex();
  }

  public final LinkedList bem()
  {
    return this.kiq.bey();
  }

  public final String ben()
  {
    return this.kiq.readString();
  }

  public final boolean beo()
  {
    return this.kiq.bez();
  }

  public final double bep()
  {
    return this.kiq.readDouble();
  }

  public final float beq()
  {
    return this.kiq.readFloat();
  }

  public final long ber()
  {
    return this.kiq.beC();
  }

  public final com.tencent.mm.ao.b bes()
  {
    return this.kiq.beA();
  }

  public final int bet()
  {
    this.kir = this.kiq.bew();
    return b.a.a.b.a.rP(this.kir);
  }

  public final void beu()
  {
    int i = b.a.a.b.a.rO(this.kir);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("FieldNumber: ").append(b.a.a.b.a.rP(this.kir)).append(" - ");
    switch (i)
    {
    case 3:
    case 4:
    default:
    case 5:
    case 1:
    case 2:
    case 0:
    }
    while (true)
    {
      return;
      localStringBuffer.append("float value: ").append(Float.toString(this.kiq.readFloat()));
      continue;
      localStringBuffer.append("double value: ").append(Double.toString(this.kiq.readDouble()));
      continue;
      localStringBuffer.append("Length delimited (String or ByteString) value: ").append(this.kiq.readString());
      continue;
      localStringBuffer.append("varint (long, int or boolean) value: ").append(this.kiq.beC());
    }
  }

  public final LinkedList rN(int paramInt)
  {
    return this.kiq.rN(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     b.a.a.a.a
 * JD-Core Version:    0.6.2
 */