package android.support.v4.content;

import android.support.v4.c.a;
import java.io.PrintWriter;

public final class h
{
  boolean cf;
  int cg;
  i dg;
  boolean dh;
  boolean di;
  boolean dj;
  boolean dk;

  public final void a(int paramInt, i parami)
  {
    if (this.dg != null)
      throw new IllegalStateException("There is already a listener registered");
    this.dg = parami;
    this.cg = paramInt;
  }

  public final void a(i parami)
  {
    if (this.dg == null)
      throw new IllegalStateException("No listener register");
    if (this.dg != parami)
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    this.dg = null;
  }

  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.cg);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.dg);
    if ((this.cf) || (this.dj) || (this.dk))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.cf);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.dj);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.dk);
    }
    if ((this.dh) || (this.di))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.dh);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.di);
    }
  }

  public final void reset()
  {
    this.di = true;
    this.cf = false;
    this.dh = false;
    this.dj = false;
    this.dk = false;
  }

  public final void startLoading()
  {
    this.cf = true;
    this.di = false;
    this.dh = false;
  }

  public final void stopLoading()
  {
    this.cf = false;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    a.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.cg);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.content.h
 * JD-Core Version:    0.6.2
 */