package android.support.v4.app;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import com.tencent.mm.sdk.platformtools.cm;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

final class m extends l
{
  static boolean DEBUG = false;
  static final Interpolator bF = new DecelerateInterpolator(2.5F);
  static final Interpolator bG = new DecelerateInterpolator(1.5F);
  static final Interpolator bH = new AccelerateInterpolator(2.5F);
  static final Interpolator bI = new AccelerateInterpolator(1.5F);
  static final boolean bi;
  k aV;
  FragmentActivity aw;
  String bA;
  boolean bB;
  Bundle bC = null;
  SparseArray bD = null;
  Runnable bE = new n(this);
  ArrayList bj;
  Runnable[] bk;
  boolean bl;
  ArrayList bm;
  ArrayList bn;
  ArrayList bo;
  ArrayList bp;
  ArrayList bq;
  ArrayList br;
  ArrayList bt;
  ArrayList bu;
  int bv = 0;
  Fragment bw;
  boolean bx;
  boolean by;
  boolean bz;

  static
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 11)
      bool = true;
    bi = bool;
  }

  private static Animation a(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(bG);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }

  private static Animation a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setInterpolator(bF);
    localScaleAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localScaleAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat3, paramFloat4);
    localAlphaAnimation.setInterpolator(bG);
    localAlphaAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return localAnimationSet;
  }

  private Animation a(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Fragment.k();
    if (paramFragment.aJ != 0)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(this.aw, paramFragment.aJ);
      if (localAnimation != null)
        return localAnimation;
    }
    if (paramInt1 == 0)
      return null;
    int i = -1;
    switch (paramInt1)
    {
    default:
    case 4097:
    case 8194:
    case 4099:
    }
    while (i < 0)
    {
      return null;
      if (paramBoolean)
      {
        i = 1;
      }
      else
      {
        i = 2;
        continue;
        if (paramBoolean)
        {
          i = 3;
        }
        else
        {
          i = 4;
          continue;
          if (paramBoolean)
            i = 5;
          else
            i = 6;
        }
      }
    }
    switch (i)
    {
    default:
      if ((paramInt2 == 0) && (this.aw.getWindow() != null))
        paramInt2 = this.aw.getWindow().getAttributes().windowAnimations;
      if (paramInt2 == 0)
        return null;
      break;
    case 1:
      return a(1.125F, 1.0F, 0.0F, 1.0F);
    case 2:
      return a(1.0F, 0.975F, 1.0F, 0.0F);
    case 3:
      return a(0.975F, 1.0F, 0.0F, 1.0F);
    case 4:
      return a(1.0F, 1.075F, 1.0F, 0.0F);
    case 5:
      return a(0.0F, 1.0F);
    case 6:
      return a(1.0F, 0.0F);
    }
    return null;
  }

  private void a(int paramInt, a parama)
  {
    try
    {
      if (this.br == null)
        this.br = new ArrayList();
      int i = this.br.size();
      if (paramInt < i)
      {
        if (DEBUG)
          new StringBuilder("Setting back stack index ").append(paramInt).append(" to ").append(parama);
        this.br.set(paramInt, parama);
      }
      while (true)
      {
        return;
        while (i < paramInt)
        {
          this.br.add(null);
          if (this.bt == null)
            this.bt = new ArrayList();
          if (DEBUG);
          this.bt.add(Integer.valueOf(i));
          i++;
        }
        if (DEBUG)
          new StringBuilder("Adding back stack index ").append(paramInt).append(" with ").append(parama);
        this.br.add(parama);
      }
    }
    finally
    {
    }
  }

  private void a(RuntimeException paramRuntimeException)
  {
    paramRuntimeException.getMessage();
    PrintWriter localPrintWriter = new PrintWriter(new android.support.v4.c.b("!24@V7hIHjrMJWvjSI3wvi8Tog=="));
    if (this.aw != null);
    try
    {
      this.aw.dump("  ", null, localPrintWriter, new String[0]);
      while (true)
      {
        label44: throw paramRuntimeException;
        try
        {
          dump("  ", null, localPrintWriter, new String[0]);
        }
        catch (Exception localException1)
        {
        }
      }
    }
    catch (Exception localException2)
    {
      break label44;
    }
  }

  private static int d(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return 0;
    case 4097:
      return 8194;
    case 8194:
      return 4097;
    case 4099:
    }
    return 4099;
  }

  private void g(Fragment paramFragment)
  {
    if (paramFragment.aM == null)
      return;
    if (this.bD == null)
      this.bD = new SparseArray();
    while (true)
    {
      paramFragment.aM.saveHierarchyState(this.bD);
      if (this.bD.size() <= 0)
        break;
      paramFragment.ai = this.bD;
      this.bD = null;
      return;
      this.bD.clear();
    }
  }

  private Bundle h(Fragment paramFragment)
  {
    if (this.bC == null)
      this.bC = new Bundle();
    Bundle localBundle1 = this.bC;
    if (paramFragment.ax != null)
    {
      Parcelable localParcelable = paramFragment.ax.v();
      if (localParcelable != null)
        localBundle1.putParcelable("android:support:fragments", localParcelable);
    }
    Bundle localBundle2;
    if (!this.bC.isEmpty())
    {
      localBundle2 = this.bC;
      this.bC = null;
    }
    while (true)
    {
      if (paramFragment.aL != null)
        g(paramFragment);
      if (paramFragment.ai != null)
      {
        if (localBundle2 == null)
          localBundle2 = new Bundle();
        localBundle2.putSparseParcelableArray("android:view_state", paramFragment.ai);
      }
      if (!paramFragment.aO)
      {
        if (localBundle2 == null)
          localBundle2 = new Bundle();
        localBundle2.putBoolean("android:user_visible_hint", paramFragment.aO);
      }
      return localBundle2;
      localBundle2 = null;
    }
  }

  private void q()
  {
    if (this.bm == null);
    while (true)
    {
      return;
      for (int i = 0; i < this.bm.size(); i++)
      {
        Fragment localFragment = (Fragment)this.bm.get(i);
        if (localFragment != null)
          e(localFragment);
      }
    }
  }

  private void r()
  {
    if (this.by)
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    if (this.bA != null)
      throw new IllegalStateException("Can not perform this action inside of " + this.bA);
  }

  public final void A()
  {
    if (this.bn != null)
      for (int i = 0; i < this.bn.size(); i++)
      {
        Fragment localFragment = (Fragment)this.bn.get(i);
        if (localFragment != null)
        {
          localFragment.onLowMemory();
          if (localFragment.ax != null)
            localFragment.ax.A();
        }
      }
  }

  public final int a(a parama)
  {
    try
    {
      if ((this.bt == null) || (this.bt.size() <= 0))
      {
        if (this.br == null)
          this.br = new ArrayList();
        int i = this.br.size();
        if (DEBUG)
          new StringBuilder("Setting back stack index ").append(i).append(" to ").append(parama);
        this.br.add(parama);
        return i;
      }
      int j = ((Integer)this.bt.remove(-1 + this.bt.size())).intValue();
      if (DEBUG)
        new StringBuilder("Adding back stack index ").append(j).append(" with ").append(parama);
      this.br.set(j, parama);
      return j;
    }
    finally
    {
    }
  }

  public final Fragment a(Bundle paramBundle, String paramString)
  {
    int i = paramBundle.getInt(paramString, -1);
    Fragment localFragment;
    if (i == -1)
      localFragment = null;
    do
    {
      return localFragment;
      if (i >= this.bm.size())
        a(new IllegalStateException("Fragement no longer exists for key " + paramString + ": index " + i));
      localFragment = (Fragment)this.bm.get(i);
    }
    while (localFragment != null);
    a(new IllegalStateException("Fragement no longer exists for key " + paramString + ": index " + i));
    return localFragment;
  }

  final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.aw == null) && (paramInt1 != 0))
      throw new IllegalStateException("No activity");
    if ((!paramBoolean) && (this.bv == paramInt1));
    do
    {
      return;
      this.bv = paramInt1;
    }
    while (this.bm == null);
    int i = 0;
    boolean bool1 = false;
    label54: Fragment localFragment;
    if (i < this.bm.size())
    {
      localFragment = (Fragment)this.bm.get(i);
      if (localFragment == null)
        break label170;
      a(localFragment, paramInt1, paramInt2, paramInt3, false);
      if (localFragment.aP == null)
        break label170;
    }
    label170: for (boolean bool2 = bool1 | localFragment.aP.D(); ; bool2 = bool1)
    {
      i++;
      bool1 = bool2;
      break label54;
      if (!bool1)
        q();
      if ((!this.bx) || (this.aw == null) || (this.bv != 5))
        break;
      this.aw.n();
      this.bx = false;
      return;
    }
  }

  public final void a(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0)
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    paramBundle.putInt(paramString, paramFragment.mIndex);
  }

  final void a(Parcelable paramParcelable, ArrayList paramArrayList)
  {
    if (paramParcelable == null);
    while (true)
    {
      return;
      FragmentManagerState localFragmentManagerState = (FragmentManagerState)paramParcelable;
      if (localFragmentManagerState.bL != null)
      {
        if (paramArrayList != null)
          for (int n = 0; n < paramArrayList.size(); n++)
          {
            Fragment localFragment5 = (Fragment)paramArrayList.get(n);
            if (DEBUG)
              new StringBuilder("restoreAllState: re-attaching retained ").append(localFragment5);
            FragmentState localFragmentState2 = localFragmentManagerState.bL[localFragment5.mIndex];
            localFragmentState2.bP = localFragment5;
            localFragment5.ai = null;
            localFragment5.au = 0;
            localFragment5.as = false;
            localFragment5.ao = false;
            localFragment5.al = null;
            if (localFragmentState2.ah != null)
            {
              localFragmentState2.ah.setClassLoader(this.aw.getClassLoader());
              localFragment5.ai = localFragmentState2.ah.getSparseParcelableArray("android:view_state");
            }
          }
        this.bm = new ArrayList(localFragmentManagerState.bL.length);
        if (this.bo != null)
          this.bo.clear();
        int i = 0;
        if (i < localFragmentManagerState.bL.length)
        {
          FragmentState localFragmentState1 = localFragmentManagerState.bL[i];
          if (localFragmentState1 != null)
          {
            FragmentActivity localFragmentActivity = this.aw;
            Fragment localFragment3 = this.bw;
            if (localFragmentState1.bP == null)
            {
              if (localFragmentState1.ak != null)
                localFragmentState1.ak.setClassLoader(localFragmentActivity.getClassLoader());
              localFragmentState1.bP = Fragment.a(localFragmentActivity, localFragmentState1.bO, localFragmentState1.ak);
              if (localFragmentState1.ah != null)
              {
                localFragmentState1.ah.setClassLoader(localFragmentActivity.getClassLoader());
                localFragmentState1.bP.ah = localFragmentState1.ah;
              }
              localFragmentState1.bP.b(localFragmentState1.mIndex, localFragment3);
              localFragmentState1.bP.ar = localFragmentState1.ar;
              localFragmentState1.bP.at = true;
              localFragmentState1.bP.az = localFragmentState1.az;
              localFragmentState1.bP.aA = localFragmentState1.aA;
              localFragmentState1.bP.aB = localFragmentState1.aB;
              localFragmentState1.bP.aE = localFragmentState1.aE;
              localFragmentState1.bP.aD = localFragmentState1.aD;
              localFragmentState1.bP.av = localFragmentActivity.aU;
              if (DEBUG)
                new StringBuilder("Instantiated fragment ").append(localFragmentState1.bP);
            }
            Fragment localFragment4 = localFragmentState1.bP;
            if (DEBUG)
              new StringBuilder("restoreAllState: active #").append(i).append(": ").append(localFragment4);
            this.bm.add(localFragment4);
            localFragmentState1.bP = null;
          }
          while (true)
          {
            i++;
            break;
            this.bm.add(null);
            if (this.bo == null)
              this.bo = new ArrayList();
            if (DEBUG);
            this.bo.add(Integer.valueOf(i));
          }
        }
        if (paramArrayList != null)
        {
          int m = 0;
          if (m < paramArrayList.size())
          {
            Fragment localFragment2 = (Fragment)paramArrayList.get(m);
            if (localFragment2.am >= 0)
              if (localFragment2.am >= this.bm.size())
                break label639;
            for (localFragment2.al = ((Fragment)this.bm.get(localFragment2.am)); ; localFragment2.al = null)
            {
              m++;
              break;
              label639: new StringBuilder("Re-attaching retained fragment ").append(localFragment2).append(" target no longer exists: ").append(localFragment2.am);
            }
          }
        }
        if (localFragmentManagerState.bM != null)
        {
          this.bn = new ArrayList(localFragmentManagerState.bM.length);
          for (int k = 0; k < localFragmentManagerState.bM.length; k++)
          {
            Fragment localFragment1 = (Fragment)this.bm.get(localFragmentManagerState.bM[k]);
            if (localFragment1 == null)
              a(new IllegalStateException("No instantiated fragment for index #" + localFragmentManagerState.bM[k]));
            localFragment1.ao = true;
            if (DEBUG)
              new StringBuilder("restoreAllState: added #").append(k).append(": ").append(localFragment1);
            if (this.bn.contains(localFragment1))
              throw new IllegalStateException("Already added!");
            this.bn.add(localFragment1);
          }
        }
        this.bn = null;
        if (localFragmentManagerState.bN == null)
          break;
        this.bp = new ArrayList(localFragmentManagerState.bN.length);
        for (int j = 0; j < localFragmentManagerState.bN.length; j++)
        {
          a locala = localFragmentManagerState.bN[j].a(this);
          if (DEBUG)
          {
            new StringBuilder("restoreAllState: back stack #").append(j).append(" (index ").append(locala.mIndex).append("): ").append(locala);
            locala.a("  ", new PrintWriter(new android.support.v4.c.b("!24@V7hIHjrMJWvjSI3wvi8Tog==")), false);
          }
          this.bp.add(locala);
          if (locala.mIndex >= 0)
            a(locala.mIndex, locala);
        }
      }
    }
    this.bp = null;
  }

  public final void a(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG)
      new StringBuilder("remove: ").append(paramFragment).append(" nesting=").append(paramFragment.au);
    int i;
    int j;
    if (paramFragment.au > 0)
    {
      i = 1;
      if (i != 0)
        break label134;
      j = 1;
      label52: if ((!paramFragment.aD) || (j != 0))
      {
        if (this.bn != null)
          this.bn.remove(paramFragment);
        if ((paramFragment.aG) && (paramFragment.aH))
          this.bx = true;
        paramFragment.ao = false;
        paramFragment.ap = true;
        if (j == 0)
          break label140;
      }
    }
    label134: label140: for (int k = 0; ; k = 1)
    {
      a(paramFragment, k, paramInt1, paramInt2, false);
      return;
      i = 0;
      break;
      j = 0;
      break label52;
    }
  }

  final void a(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (((!paramFragment.ao) || (paramFragment.aD)) && (paramInt1 > 1))
      paramInt1 = 1;
    if ((paramFragment.ap) && (paramInt1 > paramFragment.mState))
      paramInt1 = paramFragment.mState;
    if ((paramFragment.aN) && (paramFragment.mState < 4) && (paramInt1 > 3))
      paramInt1 = 3;
    ViewGroup localViewGroup;
    if (paramFragment.mState < paramInt1)
    {
      if ((paramFragment.ar) && (!paramFragment.as))
        return;
      if (paramFragment.af != null)
      {
        paramFragment.af = null;
        a(paramFragment, paramFragment.ag, 0, 0, true);
      }
      switch (paramFragment.mState)
      {
      default:
        paramFragment.mState = paramInt1;
        return;
      case 0:
        if (DEBUG)
          new StringBuilder("moveto CREATED: ").append(paramFragment);
        if (paramFragment.ah != null)
        {
          paramFragment.ai = paramFragment.ah.getSparseParcelableArray("android:view_state");
          paramFragment.al = a(paramFragment.ah, "android:target_state");
          if (paramFragment.al != null)
            paramFragment.an = paramFragment.ah.getInt("android:target_req_state", 0);
          paramFragment.aO = paramFragment.ah.getBoolean("android:user_visible_hint", true);
          if (!paramFragment.aO)
          {
            paramFragment.aN = true;
            if (paramInt1 > 3)
              paramInt1 = 3;
          }
        }
        paramFragment.aw = this.aw;
        paramFragment.ay = this.bw;
        if (this.bw != null);
        for (m localm = this.bw.ax; ; localm = this.aw.aU)
        {
          paramFragment.av = localm;
          paramFragment.aI = false;
          paramFragment.aI = true;
          if (paramFragment.aI)
            break;
          throw new as("Fragment " + paramFragment + " did not call through to super.onAttach()");
        }
        if ((paramFragment.ay != null) || (!paramFragment.aF))
        {
          Bundle localBundle2 = paramFragment.ah;
          if (paramFragment.ax != null)
            paramFragment.ax.by = false;
          paramFragment.aI = false;
          paramFragment.onCreate(localBundle2);
          if (!paramFragment.aI)
            throw new as("Fragment " + paramFragment + " did not call through to super.onCreate()");
          if (localBundle2 != null)
          {
            Parcelable localParcelable = localBundle2.getParcelable("android:support:fragments");
            if (localParcelable != null)
            {
              if (paramFragment.ax == null)
              {
                paramFragment.ax = new m();
                paramFragment.ax.a(paramFragment.aw, new d(paramFragment), paramFragment);
              }
              paramFragment.ax.a(localParcelable, null);
              paramFragment.ax.w();
            }
          }
        }
        paramFragment.aF = false;
        if (paramFragment.ar)
        {
          paramFragment.aL = paramFragment.a(paramFragment.aw.getLayoutInflater(), null, paramFragment.ah);
          if (paramFragment.aL == null)
            break label956;
          paramFragment.aM = paramFragment.aL;
          paramFragment.aL = ae.b(paramFragment.aL);
          if (paramFragment.aC)
            paramFragment.aL.setVisibility(8);
          Fragment.l();
        }
      case 1:
        if (paramInt1 > 1)
        {
          if (DEBUG)
            new StringBuilder("moveto ACTIVITY_CREATED: ").append(paramFragment);
          if (!paramFragment.ar)
          {
            if (paramFragment.aA == 0)
              break label2241;
            localViewGroup = (ViewGroup)this.aV.findViewById(paramFragment.aA);
            if ((localViewGroup == null) && (!paramFragment.at))
              a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramFragment.aA) + " (" + paramFragment.getResources().getResourceName(paramFragment.aA) + ") for fragment " + paramFragment));
          }
        }
        break;
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      paramFragment.aK = localViewGroup;
      paramFragment.aL = paramFragment.a(paramFragment.aw.getLayoutInflater(), localViewGroup, paramFragment.ah);
      if (paramFragment.aL != null)
      {
        paramFragment.aM = paramFragment.aL;
        paramFragment.aL = ae.b(paramFragment.aL);
        if (localViewGroup != null)
        {
          Animation localAnimation2 = a(paramFragment, paramInt2, true, paramInt3);
          if (localAnimation2 != null)
            paramFragment.aL.startAnimation(localAnimation2);
          localViewGroup.addView(paramFragment.aL);
        }
        if (paramFragment.aC)
          paramFragment.aL.setVisibility(8);
        Fragment.l();
      }
      while (true)
      {
        Bundle localBundle1 = paramFragment.ah;
        if (paramFragment.ax != null)
          paramFragment.ax.by = false;
        paramFragment.aI = false;
        paramFragment.onActivityCreated(localBundle1);
        if (paramFragment.aI)
          break label972;
        throw new as("Fragment " + paramFragment + " did not call through to super.onActivityCreated()");
        label956: paramFragment.aM = null;
        break;
        paramFragment.aM = null;
      }
      label972: if (paramFragment.ax != null)
        paramFragment.ax.x();
      if (paramFragment.aL != null)
      {
        if (paramFragment.ai != null)
        {
          paramFragment.aM.restoreHierarchyState(paramFragment.ai);
          paramFragment.ai = null;
        }
        paramFragment.aI = false;
        paramFragment.aI = true;
        if (!paramFragment.aI)
          throw new as("Fragment " + paramFragment + " did not call through to super.onViewStateRestored()");
      }
      paramFragment.ah = null;
      if (paramInt1 > 3)
      {
        if (DEBUG)
          new StringBuilder("moveto STARTED: ").append(paramFragment);
        if (paramFragment.ax != null)
        {
          paramFragment.ax.by = false;
          paramFragment.ax.s();
        }
        paramFragment.aI = false;
        paramFragment.onStart();
        if (!paramFragment.aI)
          throw new as("Fragment " + paramFragment + " did not call through to super.onStart()");
        if (paramFragment.ax != null)
          paramFragment.ax.y();
        if (paramFragment.aP != null)
          paramFragment.aP.J();
      }
      if (paramInt1 <= 4)
        break;
      if (DEBUG)
        new StringBuilder("moveto RESUMED: ").append(paramFragment);
      paramFragment.aq = true;
      if (paramFragment.ax != null)
      {
        paramFragment.ax.by = false;
        paramFragment.ax.s();
      }
      paramFragment.aI = false;
      paramFragment.onResume();
      if (!paramFragment.aI)
        throw new as("Fragment " + paramFragment + " did not call through to super.onResume()");
      if (paramFragment.ax != null)
      {
        paramFragment.ax.dispatchResume();
        paramFragment.ax.s();
      }
      paramFragment.ah = null;
      paramFragment.ai = null;
      break;
      if (paramFragment.mState <= paramInt1)
        break;
      switch (paramFragment.mState)
      {
      default:
        break;
      case 1:
      case 5:
      case 4:
      case 3:
      case 2:
        label1383: 
        do
        {
          if (paramInt1 > 0)
            break;
          if ((this.bz) && (paramFragment.af != null))
          {
            View localView = paramFragment.af;
            paramFragment.af = null;
            localView.clearAnimation();
          }
          if (paramFragment.af == null)
            break label1885;
          paramFragment.ag = paramInt1;
          paramInt1 = 1;
          break;
          if (paramInt1 < 5)
          {
            if (DEBUG)
              new StringBuilder("movefrom RESUMED: ").append(paramFragment);
            if (paramFragment.ax != null)
              paramFragment.ax.c(4);
            paramFragment.aI = false;
            paramFragment.onPause();
            if (!paramFragment.aI)
              throw new as("Fragment " + paramFragment + " did not call through to super.onPause()");
            paramFragment.aq = false;
          }
          if (paramInt1 < 4)
          {
            if (DEBUG)
              new StringBuilder("movefrom STARTED: ").append(paramFragment);
            if (paramFragment.ax != null)
              paramFragment.ax.dispatchStop();
            paramFragment.aI = false;
            paramFragment.onStop();
            if (!paramFragment.aI)
              throw new as("Fragment " + paramFragment + " did not call through to super.onStop()");
          }
          if (paramInt1 < 3)
          {
            if (DEBUG)
              new StringBuilder("movefrom STOPPED: ").append(paramFragment);
            paramFragment.m();
          }
        }
        while (paramInt1 >= 2);
        if (DEBUG)
          new StringBuilder("movefrom ACTIVITY_CREATED: ").append(paramFragment);
        if ((paramFragment.aL != null) && (!this.aw.isFinishing()) && (paramFragment.ai == null))
          g(paramFragment);
        if (paramFragment.ax != null)
          paramFragment.ax.c(1);
        paramFragment.aI = false;
        paramFragment.aI = true;
        if (!paramFragment.aI)
          throw new as("Fragment " + paramFragment + " did not call through to super.onDestroyView()");
        if (paramFragment.aP != null)
          paramFragment.aP.I();
        if ((paramFragment.aL != null) && (paramFragment.aK != null))
          if ((this.bv <= 0) || (this.bz))
            break label2235;
        label2235: for (Animation localAnimation1 = a(paramFragment, paramInt2, false, paramInt3); ; localAnimation1 = null)
        {
          if (localAnimation1 != null)
          {
            paramFragment.af = paramFragment.aL;
            paramFragment.ag = paramInt1;
            localAnimation1.setAnimationListener(new p(this, paramFragment));
            paramFragment.aL.startAnimation(localAnimation1);
          }
          paramFragment.aK.removeView(paramFragment.aL);
          paramFragment.aK = null;
          paramFragment.aL = null;
          paramFragment.aM = null;
          break label1383;
          label1885: if (DEBUG)
            new StringBuilder("movefrom CREATED: ").append(paramFragment);
          if (!paramFragment.aF)
          {
            if (paramFragment.ax != null)
              paramFragment.ax.z();
            paramFragment.aI = false;
            paramFragment.onDestroy();
            if (!paramFragment.aI)
              throw new as("Fragment " + paramFragment + " did not call through to super.onDestroy()");
          }
          paramFragment.aI = false;
          paramFragment.aI = true;
          if (!paramFragment.aI)
            throw new as("Fragment " + paramFragment + " did not call through to super.onDetach()");
          if (paramBoolean)
            break;
          if (!paramFragment.aF)
          {
            if (paramFragment.mIndex < 0)
              break;
            if (DEBUG)
              new StringBuilder("Freeing fragment index ").append(paramFragment);
            this.bm.set(paramFragment.mIndex, null);
            if (this.bo == null)
              this.bo = new ArrayList();
            this.bo.add(Integer.valueOf(paramFragment.mIndex));
            this.aw.b(paramFragment.aj);
            paramFragment.mIndex = -1;
            paramFragment.aj = null;
            paramFragment.ao = false;
            paramFragment.ap = false;
            paramFragment.aq = false;
            paramFragment.ar = false;
            paramFragment.as = false;
            paramFragment.at = false;
            paramFragment.au = 0;
            paramFragment.av = null;
            paramFragment.aw = null;
            paramFragment.az = 0;
            paramFragment.aA = 0;
            paramFragment.aB = null;
            paramFragment.aC = false;
            paramFragment.aD = false;
            paramFragment.aF = false;
            paramFragment.aP = null;
            paramFragment.aQ = false;
            paramFragment.aR = false;
            break;
          }
          paramFragment.aw = null;
          paramFragment.av = null;
          break;
        }
        label2241: localViewGroup = null;
      }
    }
  }

  public final void a(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.bn == null)
      this.bn = new ArrayList();
    if (DEBUG)
      new StringBuilder("add: ").append(paramFragment);
    if (paramFragment.mIndex < 0)
    {
      if ((this.bo != null) && (this.bo.size() > 0))
        break label169;
      if (this.bm == null)
        this.bm = new ArrayList();
      paramFragment.b(this.bm.size(), this.bw);
      this.bm.add(paramFragment);
    }
    while (true)
    {
      if (DEBUG)
        new StringBuilder("Allocated fragment index ").append(paramFragment);
      if (paramFragment.aD)
        return;
      if (!this.bn.contains(paramFragment))
        break;
      throw new IllegalStateException("Fragment already added: " + paramFragment);
      label169: paramFragment.b(((Integer)this.bo.remove(-1 + this.bo.size())).intValue(), this.bw);
      this.bm.set(paramFragment.mIndex, paramFragment);
    }
    this.bn.add(paramFragment);
    paramFragment.ao = true;
    paramFragment.ap = false;
    if ((paramFragment.aG) && (paramFragment.aH))
      this.bx = true;
    if (paramBoolean)
      f(paramFragment);
  }

  public final void a(FragmentActivity paramFragmentActivity, k paramk, Fragment paramFragment)
  {
    if (this.aw != null)
      throw new IllegalStateException("Already attached");
    this.aw = paramFragmentActivity;
    this.aV = paramk;
    this.bw = paramFragment;
  }

  public final void a(Runnable paramRunnable, boolean paramBoolean)
  {
    if (!paramBoolean)
      r();
    try
    {
      if (this.aw == null)
        throw new IllegalStateException("Activity has been destroyed");
    }
    finally
    {
    }
    if (this.bj == null)
      this.bj = new ArrayList();
    this.bj.add(paramRunnable);
    if (this.bj.size() == 1)
    {
      this.aw.mHandler.removeCallbacks(this.bE);
      this.aw.mHandler.post(this.bE);
    }
  }

  public final boolean a(Menu paramMenu)
  {
    int i;
    boolean bool1;
    boolean bool2;
    if (this.bn != null)
    {
      i = 0;
      bool1 = false;
      if (i >= this.bn.size())
        break label110;
      Fragment localFragment = (Fragment)this.bn.get(i);
      if (localFragment != null)
      {
        if (localFragment.aC)
          break label118;
        if ((!localFragment.aG) || (!localFragment.aH))
          break label112;
        localFragment.onPrepareOptionsMenu(paramMenu);
        bool2 = true;
        label73: if (localFragment.ax != null)
          bool2 |= localFragment.ax.a(paramMenu);
      }
    }
    while (true)
    {
      if (bool2)
        bool1 = true;
      i++;
      break;
      bool1 = false;
      label110: return bool1;
      label112: bool2 = false;
      break label73;
      label118: bool2 = false;
    }
  }

  public final boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    ArrayList localArrayList1 = null;
    int j;
    boolean bool1;
    Fragment localFragment2;
    boolean bool3;
    if (this.bn != null)
    {
      j = 0;
      bool1 = false;
      if (j >= this.bn.size())
        break label143;
      localFragment2 = (Fragment)this.bn.get(j);
      if (localFragment2 == null)
        break label213;
      if (localFragment2.aC)
        break label226;
      if ((!localFragment2.aG) || (!localFragment2.aH))
        break label220;
      localFragment2.onCreateOptionsMenu(paramMenu, paramMenuInflater);
      bool3 = true;
      label80: if (localFragment2.ax != null)
        bool3 |= localFragment2.ax.a(paramMenu, paramMenuInflater);
    }
    while (true)
    {
      if (bool3)
      {
        if (localArrayList1 == null)
          localArrayList1 = new ArrayList();
        localArrayList1.add(localFragment2);
      }
      label143: label213: for (boolean bool2 = true; ; bool2 = bool1)
      {
        j++;
        bool1 = bool2;
        break;
        bool1 = false;
        ArrayList localArrayList2 = this.bq;
        int i = 0;
        if (localArrayList2 != null)
          while (i < this.bq.size())
          {
            Fragment localFragment1 = (Fragment)this.bq.get(i);
            if ((localArrayList1 == null) || (!localArrayList1.contains(localFragment1)))
              Fragment.onDestroyOptionsMenu();
            i++;
          }
        this.bq = localArrayList1;
        return bool1;
      }
      label220: bool3 = false;
      break label80;
      label226: bool3 = false;
    }
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.bn;
    boolean bool = false;
    if (localArrayList != null);
    for (int i = 0; ; i++)
    {
      int j = this.bn.size();
      bool = false;
      Fragment localFragment;
      int k;
      if (i < j)
      {
        localFragment = (Fragment)this.bn.get(i);
        if (localFragment == null)
          continue;
        if (localFragment.aC)
          break label122;
        if ((!localFragment.aG) || (!localFragment.aH) || (!localFragment.onOptionsItemSelected(paramMenuItem)))
          break label96;
        k = 1;
      }
      while (k != 0)
      {
        bool = true;
        return bool;
        label96: if ((localFragment.ax != null) && (localFragment.ax.a(paramMenuItem)))
          k = 1;
        else
          label122: k = 0;
      }
    }
  }

  public final Fragment b(int paramInt)
  {
    Fragment localFragment;
    if (this.bn != null)
      for (int j = -1 + this.bn.size(); j >= 0; j--)
      {
        localFragment = (Fragment)this.bn.get(j);
        if ((localFragment != null) && (localFragment.az == paramInt))
          return localFragment;
      }
    if (this.bm != null)
      for (int i = -1 + this.bm.size(); ; i--)
      {
        if (i < 0)
          break label107;
        localFragment = (Fragment)this.bm.get(i);
        if ((localFragment != null) && (localFragment.az == paramInt))
          break;
      }
    label107: return null;
  }

  public final void b(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG)
      new StringBuilder("hide: ").append(paramFragment);
    if (!paramFragment.aC)
    {
      paramFragment.aC = true;
      if (paramFragment.aL != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, true, paramInt2);
        if (localAnimation != null)
          paramFragment.aL.startAnimation(localAnimation);
        paramFragment.aL.setVisibility(8);
      }
      if ((paramFragment.ao) && (paramFragment.aG) && (paramFragment.aH))
        this.bx = true;
      Fragment.i();
    }
  }

  public final void b(Menu paramMenu)
  {
    if (this.bn != null)
      for (int i = 0; i < this.bn.size(); i++)
      {
        Fragment localFragment = (Fragment)this.bn.get(i);
        if ((localFragment != null) && (!localFragment.aC) && ((!localFragment.aG) || (localFragment.ax != null)))
          localFragment.ax.b(paramMenu);
      }
  }

  public final boolean b(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.bn;
    boolean bool = false;
    if (localArrayList != null);
    for (int i = 0; ; i++)
    {
      int j = this.bn.size();
      bool = false;
      Fragment localFragment;
      int k;
      if (i < j)
      {
        localFragment = (Fragment)this.bn.get(i);
        if (localFragment == null)
          continue;
        if (localFragment.aC)
          break label106;
        if (!localFragment.onContextItemSelected(paramMenuItem))
          break label80;
        k = 1;
      }
      while (k != 0)
      {
        bool = true;
        return bool;
        label80: if ((localFragment.ax != null) && (localFragment.ax.b(paramMenuItem)))
          k = 1;
        else
          label106: k = 0;
      }
    }
  }

  final void c(int paramInt)
  {
    a(paramInt, 0, 0, false);
  }

  public final void c(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG)
      new StringBuilder("show: ").append(paramFragment);
    if (paramFragment.aC)
    {
      paramFragment.aC = false;
      if (paramFragment.aL != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, true, paramInt2);
        if (localAnimation != null)
          paramFragment.aL.startAnimation(localAnimation);
        paramFragment.aL.setVisibility(0);
      }
      if ((paramFragment.ao) && (paramFragment.aG) && (paramFragment.aH))
        this.bx = true;
      Fragment.i();
    }
  }

  public final Fragment.SavedState d(Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0)
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    int i = paramFragment.mState;
    Fragment.SavedState localSavedState = null;
    if (i > 0)
    {
      Bundle localBundle = h(paramFragment);
      localSavedState = null;
      if (localBundle != null)
        localSavedState = new Fragment.SavedState(localBundle);
    }
    return localSavedState;
  }

  public final Fragment d(String paramString)
  {
    Fragment localFragment;
    if ((this.bn != null) && (paramString != null))
      for (int j = -1 + this.bn.size(); j >= 0; j--)
      {
        localFragment = (Fragment)this.bn.get(j);
        if ((localFragment != null) && (paramString.equals(localFragment.aB)))
          return localFragment;
      }
    if ((this.bm != null) && (paramString != null))
      for (int i = -1 + this.bm.size(); ; i--)
      {
        if (i < 0)
          break label121;
        localFragment = (Fragment)this.bm.get(i);
        if ((localFragment != null) && (paramString.equals(localFragment.aB)))
          break;
      }
    label121: return null;
  }

  public final void d(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG)
      new StringBuilder("detach: ").append(paramFragment);
    if (!paramFragment.aD)
    {
      paramFragment.aD = true;
      if (paramFragment.ao)
      {
        if (this.bn != null)
        {
          if (DEBUG)
            new StringBuilder("remove from detach: ").append(paramFragment);
          this.bn.remove(paramFragment);
        }
        if ((paramFragment.aG) && (paramFragment.aH))
          this.bx = true;
        paramFragment.ao = false;
        a(paramFragment, 1, paramInt1, paramInt2, false);
      }
    }
  }

  public final void dispatchConfigurationChanged(Configuration paramConfiguration)
  {
    if (this.bn != null)
      for (int i = 0; i < this.bn.size(); i++)
      {
        Fragment localFragment = (Fragment)this.bn.get(i);
        if (localFragment != null)
        {
          localFragment.onConfigurationChanged(paramConfiguration);
          if (localFragment.ax != null)
            localFragment.ax.dispatchConfigurationChanged(paramConfiguration);
        }
      }
  }

  public final void dispatchResume()
  {
    this.by = false;
    c(5);
  }

  public final void dispatchStop()
  {
    this.by = true;
    c(3);
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    String str = paramString + "    ";
    if (this.bm != null)
    {
      int i6 = this.bm.size();
      if (i6 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (int i7 = 0; i7 < i6; i7++)
        {
          Fragment localFragment3 = (Fragment)this.bm.get(i7);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i7);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment3);
          if (localFragment3 != null)
          {
            paramPrintWriter.print(str);
            paramPrintWriter.print("mFragmentId=#");
            paramPrintWriter.print(Integer.toHexString(localFragment3.az));
            paramPrintWriter.print(" mContainerId=#");
            paramPrintWriter.print(Integer.toHexString(localFragment3.aA));
            paramPrintWriter.print(" mTag=");
            paramPrintWriter.println(localFragment3.aB);
            paramPrintWriter.print(str);
            paramPrintWriter.print("mState=");
            paramPrintWriter.print(localFragment3.mState);
            paramPrintWriter.print(" mIndex=");
            paramPrintWriter.print(localFragment3.mIndex);
            paramPrintWriter.print(" mWho=");
            paramPrintWriter.print(localFragment3.aj);
            paramPrintWriter.print(" mBackStackNesting=");
            paramPrintWriter.println(localFragment3.au);
            paramPrintWriter.print(str);
            paramPrintWriter.print("mAdded=");
            paramPrintWriter.print(localFragment3.ao);
            paramPrintWriter.print(" mRemoving=");
            paramPrintWriter.print(localFragment3.ap);
            paramPrintWriter.print(" mResumed=");
            paramPrintWriter.print(localFragment3.aq);
            paramPrintWriter.print(" mFromLayout=");
            paramPrintWriter.print(localFragment3.ar);
            paramPrintWriter.print(" mInLayout=");
            paramPrintWriter.println(localFragment3.as);
            paramPrintWriter.print(str);
            paramPrintWriter.print("mHidden=");
            paramPrintWriter.print(localFragment3.aC);
            paramPrintWriter.print(" mDetached=");
            paramPrintWriter.print(localFragment3.aD);
            paramPrintWriter.print(" mMenuVisible=");
            paramPrintWriter.print(localFragment3.aH);
            paramPrintWriter.print(" mHasMenu=");
            paramPrintWriter.println(localFragment3.aG);
            paramPrintWriter.print(str);
            paramPrintWriter.print("mRetainInstance=");
            paramPrintWriter.print(localFragment3.aE);
            paramPrintWriter.print(" mRetaining=");
            paramPrintWriter.print(localFragment3.aF);
            paramPrintWriter.print(" mUserVisibleHint=");
            paramPrintWriter.println(localFragment3.aO);
            if (localFragment3.av != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mFragmentManager=");
              paramPrintWriter.println(localFragment3.av);
            }
            if (localFragment3.aw != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mActivity=");
              paramPrintWriter.println(localFragment3.aw);
            }
            if (localFragment3.ay != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mParentFragment=");
              paramPrintWriter.println(localFragment3.ay);
            }
            if (localFragment3.ak != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mArguments=");
              paramPrintWriter.println(localFragment3.ak);
            }
            if (localFragment3.ah != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mSavedFragmentState=");
              paramPrintWriter.println(localFragment3.ah);
            }
            if (localFragment3.ai != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mSavedViewState=");
              paramPrintWriter.println(localFragment3.ai);
            }
            if (localFragment3.al != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mTarget=");
              paramPrintWriter.print(localFragment3.al);
              paramPrintWriter.print(" mTargetRequestCode=");
              paramPrintWriter.println(localFragment3.an);
            }
            if (localFragment3.aJ != 0)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mNextAnim=");
              paramPrintWriter.println(localFragment3.aJ);
            }
            if (localFragment3.aK != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mContainer=");
              paramPrintWriter.println(localFragment3.aK);
            }
            if (localFragment3.aL != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mView=");
              paramPrintWriter.println(localFragment3.aL);
            }
            if (localFragment3.aM != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mInnerView=");
              paramPrintWriter.println(localFragment3.aL);
            }
            if (localFragment3.af != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.print("mAnimatingAway=");
              paramPrintWriter.println(localFragment3.af);
              paramPrintWriter.print(str);
              paramPrintWriter.print("mStateAfterAnimating=");
              paramPrintWriter.println(localFragment3.ag);
            }
            if (localFragment3.aP != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.println("Loader Manager:");
              localFragment3.aP.dump(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
            }
            if (localFragment3.ax != null)
            {
              paramPrintWriter.print(str);
              paramPrintWriter.println("Child " + localFragment3.ax + ":");
              localFragment3.ax.dump(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
            }
          }
        }
      }
    }
    if (this.bn != null)
    {
      int i4 = this.bn.size();
      if (i4 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        for (int i5 = 0; i5 < i4; i5++)
        {
          Fragment localFragment2 = (Fragment)this.bn.get(i5);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i5);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment2.toString());
        }
      }
    }
    if (this.bq != null)
    {
      int i2 = this.bq.size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (int i3 = 0; i3 < i2; i3++)
        {
          Fragment localFragment1 = (Fragment)this.bq.get(i3);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i3);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment1.toString());
        }
      }
    }
    if (this.bp != null)
    {
      int n = this.bp.size();
      if (n > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (int i1 = 0; i1 < n; i1++)
        {
          a locala2 = (a)this.bp.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(locala2.toString());
          locala2.a(str, paramPrintWriter);
        }
      }
    }
    try
    {
      if (this.br != null)
      {
        int k = this.br.size();
        if (k > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (int m = 0; m < k; m++)
          {
            a locala1 = (a)this.br.get(m);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(m);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(locala1);
          }
        }
      }
      if ((this.bt != null) && (this.bt.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.bt.toArray()));
      }
      if (this.bj != null)
      {
        int j = this.bj.size();
        if (j > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          while (i < j)
          {
            Runnable localRunnable = (Runnable)this.bj.get(i);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localRunnable);
            i++;
          }
        }
      }
    }
    finally
    {
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mActivity=");
    paramPrintWriter.println(this.aw);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.aV);
    if (this.bw != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.bw);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.bv);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.by);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.bz);
    if (this.bx)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.bx);
    }
    if (this.bA != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.bA);
    }
    if ((this.bo != null) && (this.bo.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.bo.toArray()));
    }
  }

  public final void e(Fragment paramFragment)
  {
    if (paramFragment.aN)
    {
      if (this.bl)
        this.bB = true;
    }
    else
      return;
    paramFragment.aN = false;
    a(paramFragment, this.bv, 0, 0, false);
  }

  public final void e(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG)
      new StringBuilder("attach: ").append(paramFragment);
    if (paramFragment.aD)
    {
      paramFragment.aD = false;
      if (!paramFragment.ao)
      {
        if (this.bn == null)
          this.bn = new ArrayList();
        if (this.bn.contains(paramFragment))
          throw new IllegalStateException("Fragment already added: " + paramFragment);
        if (DEBUG)
          new StringBuilder("add from attach: ").append(paramFragment);
        this.bn.add(paramFragment);
        paramFragment.ao = true;
        if ((paramFragment.aG) && (paramFragment.aH))
          this.bx = true;
        a(paramFragment, this.bv, paramInt1, paramInt2, false);
      }
    }
  }

  public final boolean executePendingTransactions()
  {
    return s();
  }

  final void f(Fragment paramFragment)
  {
    a(paramFragment, this.bv, 0, 0, false);
  }

  public final v p()
  {
    return new a(this);
  }

  public final void popBackStack()
  {
    a(new o(this), false);
  }

  public final boolean popBackStackImmediate()
  {
    r();
    s();
    return u();
  }

  public final boolean s()
  {
    if (this.bl)
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    if (Looper.myLooper() != this.aw.mHandler.getLooper())
      throw new IllegalStateException("Must be called from main thread of process");
    boolean bool2;
    for (boolean bool1 = false; ; bool1 = true)
    {
      try
      {
        if ((this.bj == null) || (this.bj.size() == 0))
        {
          if (!this.bB)
            break label276;
          int i = 0;
          bool2 = false;
          while (i < this.bm.size())
          {
            Fragment localFragment = (Fragment)this.bm.get(i);
            if ((localFragment != null) && (localFragment.aP != null))
              bool2 |= localFragment.aP.D();
            i++;
          }
        }
        int j = this.bj.size();
        if ((this.bk == null) || (this.bk.length < j))
          this.bk = new Runnable[j];
        this.bj.toArray(this.bk);
        this.bj.clear();
        this.aw.mHandler.removeCallbacks(this.bE);
        this.bl = true;
        for (int k = 0; k < j; k++)
        {
          this.bk[k].run();
          this.bk[k] = null;
        }
      }
      finally
      {
      }
      this.bl = false;
    }
    if (!bool2)
    {
      this.bB = false;
      q();
    }
    label276: return bool1;
  }

  final void t()
  {
    if (this.bu != null)
      for (int i = 0; i < this.bu.size(); i++)
        this.bu.get(i);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.bw != null)
      android.support.v4.c.a.a(this.bw, localStringBuilder);
    while (true)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      android.support.v4.c.a.a(this.aw, localStringBuilder);
    }
  }

  final boolean u()
  {
    if (this.bp == null);
    int i;
    do
    {
      return false;
      i = -1 + this.bp.size();
    }
    while (i < 0);
    a locala = (a)this.bp.remove(i);
    if (DEBUG)
    {
      new StringBuilder("popFromBackStack: ").append(locala);
      locala.a("  ", new PrintWriter(new android.support.v4.c.b("!24@V7hIHjrMJWvjSI3wvi8Tog==")));
    }
    locala.a(-1);
    b localb = locala.E;
    if (localb != null)
    {
      switch (localb.W)
      {
      default:
        throw new IllegalArgumentException("Unknown cmd: " + localb.W);
      case 1:
        Fragment localFragment8 = localb.X;
        localFragment8.aJ = localb.ab;
        locala.C.a(localFragment8, d(locala.K), locala.L);
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      while (true)
      {
        localb = localb.V;
        break;
        Fragment localFragment6 = localb.X;
        if (localFragment6 != null)
        {
          localFragment6.aJ = localb.ab;
          locala.C.a(localFragment6, d(locala.K), locala.L);
        }
        if (localb.ac != null)
        {
          for (int k = 0; k < localb.ac.size(); k++)
          {
            Fragment localFragment7 = (Fragment)localb.ac.get(k);
            localFragment7.aJ = localb.aa;
            locala.C.a(localFragment7, false);
          }
          Fragment localFragment5 = localb.X;
          localFragment5.aJ = localb.aa;
          locala.C.a(localFragment5, false);
          continue;
          Fragment localFragment4 = localb.X;
          localFragment4.aJ = localb.aa;
          locala.C.c(localFragment4, d(locala.K), locala.L);
          continue;
          Fragment localFragment3 = localb.X;
          localFragment3.aJ = localb.ab;
          locala.C.b(localFragment3, d(locala.K), locala.L);
          continue;
          Fragment localFragment2 = localb.X;
          localFragment2.aJ = localb.aa;
          locala.C.e(localFragment2, d(locala.K), locala.L);
          continue;
          Fragment localFragment1 = localb.X;
          localFragment1.aJ = localb.aa;
          locala.C.d(localFragment1, d(locala.K), locala.L);
        }
      }
    }
    locala.C.a(locala.C.bv, d(locala.K), locala.L, true);
    m localm;
    int j;
    if (locala.mIndex >= 0)
    {
      localm = locala.C;
      j = locala.mIndex;
    }
    try
    {
      localm.br.set(j, null);
      if (localm.bt == null)
        localm.bt = new ArrayList();
      if (DEBUG);
      localm.bt.add(Integer.valueOf(j));
      locala.mIndex = -1;
      t();
      return true;
    }
    finally
    {
    }
  }

  final Parcelable v()
  {
    s();
    if (bi)
      this.by = true;
    if ((this.bm == null) || (this.bm.size() <= 0))
      return null;
    int i = this.bm.size();
    FragmentState[] arrayOfFragmentState = new FragmentState[i];
    int j = 0;
    int k = 0;
    Fragment localFragment;
    FragmentState localFragmentState;
    if (j < i)
    {
      localFragment = (Fragment)this.bm.get(j);
      if (localFragment == null)
        break label684;
      if (localFragment.mIndex < 0)
        a(new IllegalStateException("Failure saving state: active " + localFragment + " has cleared index: " + localFragment.mIndex));
      localFragmentState = new FragmentState(localFragment);
      arrayOfFragmentState[j] = localFragmentState;
      if ((localFragment.mState > 0) && (localFragmentState.ah == null))
      {
        localFragmentState.ah = h(localFragment);
        if (localFragment.al != null)
        {
          if (localFragment.al.mIndex < 0)
            a(new IllegalStateException("Failure saving state: " + localFragment + " has target not in fragment manager: " + localFragment.al));
          if (localFragmentState.ah == null)
            localFragmentState.ah = new Bundle();
          a(localFragmentState.ah, "android:target_state", localFragment.al);
          if (localFragment.an != 0)
            localFragmentState.ah.putInt("android:target_req_state", localFragment.an);
        }
        label297: if (DEBUG)
          new StringBuilder("Saved state of ").append(localFragment).append(": ").append(localFragmentState.ah);
      }
    }
    label684: for (int i3 = 1; ; i3 = k)
    {
      j++;
      k = i3;
      break;
      localFragmentState.ah = localFragment.ah;
      break label297;
      if (k == 0)
        return null;
      if (this.bn != null)
      {
        int i1 = this.bn.size();
        if (i1 > 0)
        {
          arrayOfInt = new int[i1];
          for (int i2 = 0; i2 < i1; i2++)
          {
            arrayOfInt[i2] = ((Fragment)this.bn.get(i2)).mIndex;
            if (arrayOfInt[i2] < 0)
              a(new IllegalStateException("Failure saving state: active " + this.bn.get(i2) + " has cleared index: " + arrayOfInt[i2]));
            if (DEBUG)
              new StringBuilder("saveAllState: adding fragment #").append(i2).append(": ").append(this.bn.get(i2));
          }
        }
      }
      int[] arrayOfInt = null;
      ArrayList localArrayList = this.bp;
      BackStackState[] arrayOfBackStackState = null;
      if (localArrayList != null)
      {
        int m = this.bp.size();
        arrayOfBackStackState = null;
        if (m > 0)
        {
          arrayOfBackStackState = new BackStackState[m];
          for (int n = 0; n < m; n++)
          {
            arrayOfBackStackState[n] = new BackStackState((a)this.bp.get(n));
            if (DEBUG)
              new StringBuilder("saveAllState: adding back stack #").append(n).append(": ").append(this.bp.get(n));
          }
        }
      }
      FragmentManagerState localFragmentManagerState = new FragmentManagerState();
      localFragmentManagerState.bL = arrayOfFragmentState;
      localFragmentManagerState.bM = arrayOfInt;
      localFragmentManagerState.bN = arrayOfBackStackState;
      return localFragmentManagerState;
    }
  }

  public final void w()
  {
    this.by = false;
    c(1);
  }

  public final void x()
  {
    this.by = false;
    c(2);
  }

  public final void y()
  {
    this.by = false;
    c(4);
  }

  public final void z()
  {
    this.bz = true;
    s();
    c(0);
    this.aw = null;
    this.aV = null;
    this.bw = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.m
 * JD-Core Version:    0.6.2
 */