package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.c.a;
import android.support.v4.content.h;
import android.support.v4.content.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class z
  implements i
{
  boolean aF;
  boolean bz;
  boolean cf;
  final int cg;
  final Bundle ch;
  x ci;
  h cj;
  boolean ck;
  boolean cl;
  boolean cm;
  boolean cn;
  boolean co;
  z cp;
  Object mData;

  final void a(h paramh, Object paramObject)
  {
    String str2;
    if (this.ci != null)
    {
      if (this.cq.aw == null)
        break label176;
      str2 = this.cq.aw.aU.bA;
      this.cq.aw.aU.bA = "onLoadFinished";
    }
    label176: for (String str1 = str2; ; str1 = null)
      try
      {
        if (y.DEBUG)
        {
          StringBuilder localStringBuilder1 = new StringBuilder("  onLoadFinished in ").append(paramh).append(": ");
          StringBuilder localStringBuilder2 = new StringBuilder(64);
          a.a(paramObject, localStringBuilder2);
          localStringBuilder2.append("}");
          localStringBuilder1.append(localStringBuilder2.toString());
        }
        if (this.cq.aw != null)
          this.cq.aw.aU.bA = str1;
        this.cl = true;
        return;
      }
      finally
      {
        if (this.cq.aw != null)
          this.cq.aw.aU.bA = str1;
      }
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter)
  {
    while (true)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.cg);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.ch);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(this.ci);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.cj);
      if (this.cj != null)
        this.cj.a(paramString + "  ", paramPrintWriter);
      if ((this.ck) || (this.cl))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mHaveData=");
        paramPrintWriter.print(this.ck);
        paramPrintWriter.print("  mDeliveredData=");
        paramPrintWriter.println(this.cl);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mData=");
        paramPrintWriter.println(this.mData);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.cf);
      paramPrintWriter.print(" mReportNextStart=");
      paramPrintWriter.print(this.cn);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.bz);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mRetaining=");
      paramPrintWriter.print(this.aF);
      paramPrintWriter.print(" mRetainingStarted=");
      paramPrintWriter.print(this.cm);
      paramPrintWriter.print(" mListenerRegistered=");
      paramPrintWriter.println(this.co);
      if (this.cp == null)
        break;
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(this.cp);
      paramPrintWriter.println(":");
      this = this.cp;
      paramString = paramString + "  ";
    }
  }

  final void destroy()
  {
    if (y.DEBUG)
      new StringBuilder("  Destroying: ").append(this);
    this.bz = true;
    boolean bool = this.cl;
    this.cl = false;
    String str1;
    if ((this.ci != null) && (this.cj != null) && (this.ck) && (bool))
    {
      if (y.DEBUG)
        new StringBuilder("  Reseting: ").append(this);
      if (this.cq.aw == null)
        break label249;
      String str2 = this.cq.aw.aU.bA;
      this.cq.aw.aU.bA = "onLoaderReset";
      str1 = str2;
    }
    while (true)
      label249: 
      try
      {
        if (this.cq.aw != null)
          this.cq.aw.aU.bA = str1;
        this.ci = null;
        this.mData = null;
        this.ck = false;
        if (this.cj != null)
        {
          if (this.co)
          {
            this.co = false;
            this.cj.a(this);
          }
          this.cj.reset();
        }
        if (this.cp != null)
          this = this.cp;
      }
      finally
      {
        if (this.cq.aw != null)
          this.cq.aw.aU.bA = str1;
      }
  }

  final void stop()
  {
    if (y.DEBUG)
      new StringBuilder("  Stopping: ").append(this);
    this.cf = false;
    if ((!this.aF) && (this.cj != null) && (this.co))
    {
      this.co = false;
      this.cj.a(this);
      this.cj.stopLoading();
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.cg);
    localStringBuilder.append(" : ");
    a.a(this.cj, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.z
 * JD-Core Version:    0.6.2
 */