package android.support.v4.app;

import android.support.v4.c.a;
import android.support.v4.c.d;
import android.support.v4.content.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class y extends w
{
  static boolean DEBUG = false;
  boolean aF;
  final String aj;
  FragmentActivity aw;
  final d cd;
  final d ce;
  boolean cf;

  public final boolean D()
  {
    int i = this.cd.size();
    int j = 0;
    boolean bool1 = false;
    if (j < i)
    {
      z localz = (z)this.cd.valueAt(j);
      if ((localz.cf) && (!localz.cl));
      for (boolean bool2 = true; ; bool2 = false)
      {
        bool1 |= bool2;
        j++;
        break;
      }
    }
    return bool1;
  }

  final void F()
  {
    if (DEBUG)
      new StringBuilder("Starting in ").append(this);
    if (this.cf)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStart when already started: ").append(this);
      return;
    }
    this.cf = true;
    int i = -1 + this.cd.size();
    label70: z localz;
    if (i >= 0)
    {
      localz = (z)this.cd.valueAt(i);
      if ((!localz.aF) || (!localz.cm))
        break label111;
      localz.cf = true;
    }
    while (true)
    {
      i--;
      break label70;
      break;
      label111: if (!localz.cf)
      {
        localz.cf = true;
        if (DEBUG)
          new StringBuilder("  Starting: ").append(localz);
        if ((localz.cj == null) && (localz.ci != null))
        {
          x localx = localz.ci;
          localz.cj = localx.E();
        }
        if (localz.cj != null)
        {
          if ((localz.cj.getClass().isMemberClass()) && (!Modifier.isStatic(localz.cj.getClass().getModifiers())))
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + localz.cj);
          if (!localz.co)
          {
            localz.cj.a(localz.cg, localz);
            localz.co = true;
          }
          localz.cj.startLoading();
        }
      }
    }
  }

  final void G()
  {
    if (DEBUG)
      new StringBuilder("Stopping in ").append(this);
    if (!this.cf)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStop when not started: ").append(this);
      return;
    }
    for (int i = -1 + this.cd.size(); i >= 0; i--)
      ((z)this.cd.valueAt(i)).stop();
    this.cf = false;
  }

  final void H()
  {
    if (DEBUG)
      new StringBuilder("Retaining in ").append(this);
    if (!this.cf)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doRetain when not started: ").append(this);
    }
    while (true)
    {
      return;
      this.aF = true;
      this.cf = false;
      for (int i = -1 + this.cd.size(); i >= 0; i--)
      {
        z localz = (z)this.cd.valueAt(i);
        if (DEBUG)
          new StringBuilder("  Retaining: ").append(localz);
        localz.aF = true;
        localz.cm = localz.cf;
        localz.cf = false;
        localz.ci = null;
      }
    }
  }

  final void I()
  {
    for (int i = -1 + this.cd.size(); i >= 0; i--)
      ((z)this.cd.valueAt(i)).cn = true;
  }

  final void J()
  {
    for (int i = -1 + this.cd.size(); i >= 0; i--)
    {
      z localz = (z)this.cd.valueAt(i);
      if ((localz.cf) && (localz.cn))
      {
        localz.cn = false;
        if (localz.ck)
          localz.a(localz.cj, localz.mData);
      }
    }
  }

  final void K()
  {
    if (!this.aF)
    {
      if (DEBUG)
        new StringBuilder("Destroying Active in ").append(this);
      for (int j = -1 + this.cd.size(); j >= 0; j--)
        ((z)this.cd.valueAt(j)).destroy();
      this.cd.clear();
    }
    if (DEBUG)
      new StringBuilder("Destroying Inactive in ").append(this);
    for (int i = -1 + this.ce.size(); i >= 0; i--)
      ((z)this.ce.valueAt(i)).destroy();
    this.ce.clear();
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    if (this.cd.size() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      String str2 = paramString + "    ";
      for (int j = 0; j < this.cd.size(); j++)
      {
        z localz2 = (z)this.cd.valueAt(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.cd.keyAt(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localz2.toString());
        localz2.a(str2, paramFileDescriptor, paramPrintWriter);
      }
    }
    if (this.ce.size() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      String str1 = paramString + "    ";
      while (i < this.ce.size())
      {
        z localz1 = (z)this.ce.valueAt(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.ce.keyAt(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localz1.toString());
        localz1.a(str1, paramFileDescriptor, paramPrintWriter);
        i++;
      }
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    a.a(this.aw, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.y
 * JD-Core Version:    0.6.2
 */