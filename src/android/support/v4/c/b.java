package android.support.v4.c;

import java.io.Writer;

public final class b extends Writer
{
  private final String aB;
  private StringBuilder cL = new StringBuilder(128);

  public b(String paramString)
  {
    this.aB = paramString;
  }

  private void M()
  {
    if (this.cL.length() > 0)
      this.cL.delete(0, this.cL.length());
  }

  public final void close()
  {
    M();
  }

  public final void flush()
  {
    M();
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n')
        M();
      while (true)
      {
        i++;
        break;
        this.cL.append(c);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.c.b
 * JD-Core Version:    0.6.2
 */