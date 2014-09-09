package android.support.v4.app;

import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends v
  implements Runnable
{
  final m C;
  b D;
  b E;
  int F;
  int G;
  int H;
  int I;
  int J;
  int K;
  int L;
  boolean M;
  boolean N = true;
  boolean O;
  int P;
  CharSequence Q;
  int S;
  CharSequence T;
  int mIndex = -1;
  String mName;

  public a(m paramm)
  {
    this.C = paramm;
  }

  private int a(boolean paramBoolean)
  {
    if (this.O)
      throw new IllegalStateException("commit already called");
    if (m.DEBUG)
    {
      new StringBuilder("Commit: ").append(this);
      a("  ", new PrintWriter(new android.support.v4.c.b("!24@V7hIHjrMJWvjSI3wvi8Tog==")));
    }
    this.O = true;
    if (this.M);
    for (this.mIndex = this.C.a(this); ; this.mIndex = -1)
    {
      this.C.a(this, paramBoolean);
      return this.mIndex;
    }
  }

  private void b(int paramInt, Fragment paramFragment, String paramString)
  {
    paramFragment.av = this.C;
    if (paramString != null)
    {
      if ((paramFragment.aB != null) && (!paramString.equals(paramFragment.aB)))
        throw new IllegalStateException("Can't change tag of fragment " + paramFragment + ": was " + paramFragment.aB + " now " + paramString);
      paramFragment.aB = paramString;
    }
    if (paramInt != 0)
    {
      if ((paramFragment.az != 0) && (paramFragment.az != paramInt))
        throw new IllegalStateException("Can't change container ID of fragment " + paramFragment + ": was " + paramFragment.az + " now " + paramInt);
      paramFragment.az = paramInt;
      paramFragment.aA = paramInt;
    }
    b localb = new b();
    localb.W = 1;
    localb.X = paramFragment;
    a(localb);
  }

  public final v a(int paramInt, Fragment paramFragment)
  {
    b(paramInt, paramFragment, null);
    return this;
  }

  public final v a(int paramInt, Fragment paramFragment, String paramString)
  {
    b(paramInt, paramFragment, paramString);
    return this;
  }

  public final v a(Fragment paramFragment)
  {
    b localb = new b();
    localb.W = 3;
    localb.X = paramFragment;
    a(localb);
    return this;
  }

  final void a(int paramInt)
  {
    if (!this.M);
    while (true)
    {
      return;
      if (m.DEBUG)
        new StringBuilder("Bump nesting in ").append(this).append(" by ").append(paramInt);
      for (b localb = this.D; localb != null; localb = localb.U)
      {
        if (localb.X != null)
        {
          Fragment localFragment2 = localb.X;
          localFragment2.au = (paramInt + localFragment2.au);
          if (m.DEBUG)
            new StringBuilder("Bump nesting of ").append(localb.X).append(" to ").append(localb.X.au);
        }
        if (localb.ac != null)
          for (int i = -1 + localb.ac.size(); i >= 0; i--)
          {
            Fragment localFragment1 = (Fragment)localb.ac.get(i);
            localFragment1.au = (paramInt + localFragment1.au);
            if (m.DEBUG)
              new StringBuilder("Bump nesting of ").append(localFragment1).append(" to ").append(localFragment1.au);
          }
      }
    }
  }

  final void a(b paramb)
  {
    if (this.D == null)
    {
      this.E = paramb;
      this.D = paramb;
    }
    while (true)
    {
      paramb.Y = this.G;
      paramb.Z = this.H;
      paramb.aa = this.I;
      paramb.ab = this.J;
      this.F = (1 + this.F);
      return;
      paramb.V = this.E;
      this.E.U = paramb;
      this.E = paramb;
    }
  }

  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    a(paramString, paramPrintWriter, true);
  }

  public final void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.mName);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.mIndex);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.O);
      if (this.K != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.K));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.L));
      }
      if ((this.G != 0) || (this.H != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.G));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.H));
      }
      if ((this.I != 0) || (this.J != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.I));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.J));
      }
      if ((this.P != 0) || (this.Q != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.P));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.Q);
      }
      if ((this.S != 0) || (this.T != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.S));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.T);
      }
    }
    if (this.D != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str1 = paramString + "    ";
      b localb1 = this.D;
      int i = 0;
      b localb2 = localb1;
      while (localb2 != null)
      {
        String str2;
        int j;
        switch (localb2.W)
        {
        default:
          str2 = "cmd=" + localb2.W;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str2);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localb2.X);
          if (paramBoolean)
          {
            if ((localb2.Y != 0) || (localb2.Z != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localb2.Y));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localb2.Z));
            }
            if ((localb2.aa != 0) || (localb2.ab != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localb2.aa));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localb2.ab));
            }
          }
          if ((localb2.ac == null) || (localb2.ac.size() <= 0))
            break label793;
          j = 0;
          label630: if (j >= localb2.ac.size())
            break label793;
          paramPrintWriter.print(str1);
          if (localb2.ac.size() == 1)
            paramPrintWriter.print("Removed: ");
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
        while (true)
        {
          paramPrintWriter.println(localb2.ac.get(j));
          j++;
          break label630;
          str2 = "NULL";
          break;
          str2 = "ADD";
          break;
          str2 = "REPLACE";
          break;
          str2 = "REMOVE";
          break;
          str2 = "HIDE";
          break;
          str2 = "SHOW";
          break;
          str2 = "DETACH";
          break;
          str2 = "ATTACH";
          break;
          if (j == 0)
            paramPrintWriter.println("Removed:");
          paramPrintWriter.print(str1);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(j);
          paramPrintWriter.print(": ");
        }
        label793: localb2 = localb2.U;
        i++;
      }
    }
  }

  public final v b(Fragment paramFragment)
  {
    b localb = new b();
    localb.W = 6;
    localb.X = paramFragment;
    a(localb);
    return this;
  }

  public final v c(Fragment paramFragment)
  {
    b localb = new b();
    localb.W = 7;
    localb.X = paramFragment;
    a(localb);
    return this;
  }

  public final int commit()
  {
    return a(false);
  }

  public final int commitAllowingStateLoss()
  {
    return a(true);
  }

  public final v g()
  {
    if (this.M)
      throw new IllegalStateException("This transaction is already being added to the back stack");
    this.N = false;
    return this;
  }

  public final boolean isEmpty()
  {
    return this.F == 0;
  }

  public final void run()
  {
    if (m.DEBUG)
      new StringBuilder("Run: ").append(this);
    if ((this.M) && (this.mIndex < 0))
      throw new IllegalStateException("addToBackStack() called after commit()");
    a(1);
    b localb = this.D;
    if (localb != null)
    {
      switch (localb.W)
      {
      default:
        throw new IllegalArgumentException("Unknown cmd: " + localb.W);
      case 1:
        Fragment localFragment9 = localb.X;
        localFragment9.aJ = localb.Y;
        this.C.a(localFragment9, false);
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      while (true)
      {
        localb = localb.U;
        break;
        Fragment localFragment6 = localb.X;
        Fragment localFragment7;
        if (this.C.bn != null)
        {
          int i = 0;
          localFragment7 = localFragment6;
          if (i < this.C.bn.size())
          {
            Fragment localFragment8 = (Fragment)this.C.bn.get(i);
            if (m.DEBUG)
              new StringBuilder("OP_REPLACE: adding=").append(localFragment7).append(" old=").append(localFragment8);
            if ((localFragment7 == null) || (localFragment8.aA == localFragment7.aA))
            {
              if (localFragment8 != localFragment7)
                break label296;
              localFragment7 = null;
              localb.X = null;
            }
            while (true)
            {
              i++;
              break;
              label296: if (localb.ac == null)
                localb.ac = new ArrayList();
              localb.ac.add(localFragment8);
              localFragment8.aJ = localb.Z;
              if (this.M)
              {
                localFragment8.au = (1 + localFragment8.au);
                if (m.DEBUG)
                  new StringBuilder("Bump nesting of ").append(localFragment8).append(" to ").append(localFragment8.au);
              }
              this.C.a(localFragment8, this.K, this.L);
            }
          }
        }
        else
        {
          localFragment7 = localFragment6;
        }
        if (localFragment7 != null)
        {
          localFragment7.aJ = localb.Y;
          this.C.a(localFragment7, false);
          continue;
          Fragment localFragment5 = localb.X;
          localFragment5.aJ = localb.Z;
          this.C.a(localFragment5, this.K, this.L);
          continue;
          Fragment localFragment4 = localb.X;
          localFragment4.aJ = localb.Z;
          this.C.b(localFragment4, this.K, this.L);
          continue;
          Fragment localFragment3 = localb.X;
          localFragment3.aJ = localb.Y;
          this.C.c(localFragment3, this.K, this.L);
          continue;
          Fragment localFragment2 = localb.X;
          localFragment2.aJ = localb.Z;
          this.C.d(localFragment2, this.K, this.L);
          continue;
          Fragment localFragment1 = localb.X;
          localFragment1.aJ = localb.Y;
          this.C.e(localFragment1, this.K, this.L);
        }
      }
    }
    this.C.a(this.C.bv, this.K, this.L, true);
    if (this.M)
    {
      m localm = this.C;
      if (localm.bp == null)
        localm.bp = new ArrayList();
      localm.bp.add(this);
      localm.t();
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.mIndex >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mIndex);
    }
    if (this.mName != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.mName);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.a
 * JD-Core Version:    0.6.2
 */