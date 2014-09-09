package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.c.d;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.mm.compatible.f.a;
import com.tencent.mm.sdk.platformtools.cm;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class FragmentActivity extends Activity
{
  boolean aF;
  y aP;
  boolean aQ;
  boolean aR;
  final m aU = new m();
  final k aV = new h(this);
  boolean aW;
  boolean aX;
  boolean aY;
  boolean aZ;
  boolean aq;
  HashMap ba;
  final cm mHandler = new g(this);

  private static String a(View paramView)
  {
    char c1 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    switch (paramView.getVisibility())
    {
    default:
      localStringBuilder.append(c2);
    case 0:
    case 4:
    case 8:
    }
    while (true)
    {
      char c3;
      label108: char c4;
      label126: char c5;
      label143: char c6;
      label161: char c7;
      label179: char c8;
      label197: char c9;
      label215: label236: char c10;
      label253: int i;
      Resources localResources;
      if (paramView.isFocusable())
      {
        c3 = c1;
        localStringBuilder.append(c3);
        if (!paramView.isEnabled())
          break label533;
        c4 = 'E';
        localStringBuilder.append(c4);
        if (!paramView.willNotDraw())
          break label539;
        c5 = c2;
        localStringBuilder.append(c5);
        if (!paramView.isHorizontalScrollBarEnabled())
          break label546;
        c6 = 'H';
        localStringBuilder.append(c6);
        if (!paramView.isVerticalScrollBarEnabled())
          break label552;
        c7 = 'V';
        localStringBuilder.append(c7);
        if (!paramView.isClickable())
          break label558;
        c8 = 'C';
        localStringBuilder.append(c8);
        if (!paramView.isLongClickable())
          break label564;
        c9 = 'L';
        localStringBuilder.append(c9);
        localStringBuilder.append(' ');
        if (!paramView.isFocused())
          break label570;
        localStringBuilder.append(c1);
        if (!paramView.isSelected())
          break label575;
        c10 = 'S';
        localStringBuilder.append(c10);
        if (paramView.isPressed())
          c2 = 'P';
        localStringBuilder.append(c2);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        i = paramView.getId();
        if (i != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(i));
          localResources = paramView.getResources();
          if ((i != 0) && (localResources != null))
            switch (0xFF000000 & i)
            {
            default:
            case 2130706432:
            case 16777216:
            }
        }
      }
      try
      {
        String str1 = localResources.getResourcePackageName(i);
        while (true)
        {
          String str2 = localResources.getResourceTypeName(i);
          String str3 = localResources.getResourceEntryName(i);
          localStringBuilder.append(" ");
          localStringBuilder.append(str1);
          localStringBuilder.append(":");
          localStringBuilder.append(str2);
          localStringBuilder.append("/");
          localStringBuilder.append(str3);
          label485: localStringBuilder.append("}");
          return localStringBuilder.toString();
          localStringBuilder.append('V');
          break;
          localStringBuilder.append('I');
          break;
          localStringBuilder.append('G');
          break;
          c3 = c2;
          break label108;
          label533: c4 = c2;
          break label126;
          label539: c5 = 'D';
          break label143;
          label546: c6 = c2;
          break label161;
          label552: c7 = c2;
          break label179;
          label558: c8 = c2;
          break label197;
          label564: c9 = c2;
          break label215;
          label570: c1 = c2;
          break label236;
          label575: c10 = c2;
          break label253;
          str1 = "app";
          continue;
          str1 = "android";
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        break label485;
      }
    }
  }

  private void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null)
      paramPrintWriter.println("null");
    while (true)
    {
      return;
      paramPrintWriter.println(a(paramView));
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int i = localViewGroup.getChildCount();
        if (i > 0)
        {
          String str = paramString + "  ";
          for (int j = 0; j < i; j++)
            a(str, paramPrintWriter, localViewGroup.getChildAt(j));
        }
      }
    }
  }

  public final void a(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1)
    {
      super.startActivityForResult(paramIntent, -1);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0)
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, (1 + paramFragment.mIndex << 16) + (0xFFFF & paramInt));
  }

  final void b(String paramString)
  {
    if (this.ba != null)
    {
      y localy = (y)this.ba.get(paramString);
      if ((localy != null) && (!localy.aF))
      {
        localy.K();
        this.ba.remove(paramString);
      }
    }
  }

  final void b(boolean paramBoolean)
  {
    if (!this.aY)
    {
      this.aY = true;
      this.aF = paramBoolean;
      this.mHandler.removeMessages(1);
      if (this.aQ)
      {
        this.aQ = false;
        if (this.aP != null)
        {
          if (this.aF)
            break label67;
          this.aP.G();
        }
      }
    }
    while (true)
    {
      this.aU.c(2);
      return;
      label67: this.aP.H();
    }
  }

  final y c(String paramString)
  {
    if (this.ba == null)
      this.ba = new HashMap();
    y localy = (y)this.ba.get(paramString);
    if (localy != null)
      localy.aw = this;
    return localy;
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.aW);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.aq);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.aX);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.aY);
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.aQ);
    if (this.aP != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.aP)));
      paramPrintWriter.println(":");
      this.aP.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.aU.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    a(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }

  public void n()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      invalidateOptionsMenu();
      return;
    }
    this.aZ = true;
  }

  public final l o()
  {
    return this.aU;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.aU.by = false;
    int i = paramInt1 >> 16;
    if (i != 0)
    {
      int j = i - 1;
      if ((this.aU.bm == null) || (j < 0) || (j >= this.aU.bm.size()))
      {
        new StringBuilder("Activity result fragment index out of range: 0x").append(Integer.toHexString(paramInt1));
        return;
      }
      Fragment localFragment = (Fragment)this.aU.bm.get(j);
      if (localFragment == null)
      {
        new StringBuilder("Activity result no fragment exists for index: 0x").append(Integer.toHexString(paramInt1));
        return;
      }
      localFragment.onActivityResult(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onBackPressed()
  {
    if (!this.aU.popBackStackImmediate())
      finish();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.aU.dispatchConfigurationChanged(paramConfiguration);
  }

  protected void onCreate(Bundle paramBundle)
  {
    this.aU.a(this, this.aV, null);
    if (getLayoutInflater().getFactory() == null)
      getLayoutInflater().setFactory(this);
    super.onCreate(paramBundle);
    j localj = (j)getLastNonConfigurationInstance();
    if (localj != null)
      this.ba = localj.bh;
    Parcelable localParcelable;
    m localm;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      localm = this.aU;
      if (localj == null)
        break label100;
    }
    label100: for (ArrayList localArrayList = localj.bg; ; localArrayList = null)
    {
      localm.a(localParcelable, localArrayList);
      this.aU.w();
      return;
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool = super.onCreatePanelMenu(paramInt, paramMenu) | this.aU.a(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT >= 11)
        return bool;
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString))
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, i.bc);
    if (str1 == null)
      str1 = localTypedArray.getString(0);
    int i = localTypedArray.getResourceId(1, -1);
    String str2 = localTypedArray.getString(2);
    localTypedArray.recycle();
    Object localObject = null;
    if (i != -1)
      localObject = this.aU.b(i);
    if ((localObject == null) && (str2 != null))
      localObject = this.aU.d(str2);
    if (localObject == null)
      localObject = this.aU.b(0);
    if (m.DEBUG)
      new StringBuilder("onCreateView: id=0x").append(Integer.toHexString(i)).append(" fname=").append(str1).append(" existing=").append(localObject);
    int j;
    if (localObject == null)
    {
      Fragment localFragment = Fragment.a(this, str1);
      localFragment.ar = true;
      if (i != 0)
      {
        j = i;
        localFragment.az = j;
        localFragment.aA = 0;
        localFragment.aB = str2;
        localFragment.as = true;
        localFragment.av = this.aU;
        localFragment.aI = true;
        this.aU.a(localFragment, true);
        localObject = localFragment;
      }
    }
    while (true)
    {
      if (((Fragment)localObject).aL != null)
        break label435;
      throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
      j = 0;
      break;
      if (((Fragment)localObject).as)
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + str1);
      ((Fragment)localObject).as = true;
      if (!((Fragment)localObject).aF)
        ((Fragment)localObject).aI = true;
      this.aU.f((Fragment)localObject);
    }
    label435: if (i != 0)
      ((Fragment)localObject).aL.setId(i);
    if (((Fragment)localObject).aL.getTag() == null)
      ((Fragment)localObject).aL.setTag(str2);
    return ((Fragment)localObject).aL;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    b(false);
    this.aU.z();
    if (this.aP != null)
      this.aP.K();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    this.aU.A();
  }

  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (!(paramMenuItem.getTitleCondensed() instanceof String))
      a.a(paramMenuItem, getClass().getName());
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 0:
      return this.aU.a(paramMenuItem);
    case 6:
    }
    return this.aU.b(paramMenuItem);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.aU.by = false;
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.aU.b(paramMenu);
    }
  }

  protected void onPause()
  {
    super.onPause();
    this.aq = false;
    if (this.mHandler.hasMessages(2))
    {
      this.mHandler.removeMessages(2);
      this.aU.dispatchResume();
    }
    this.aU.c(4);
  }

  protected void onPostResume()
  {
    super.onPostResume();
    this.mHandler.removeMessages(2);
    this.aU.dispatchResume();
    this.aU.s();
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.aZ)
      {
        this.aZ = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return super.onPreparePanel(paramInt, paramView, paramMenu) | this.aU.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  protected void onResume()
  {
    super.onResume();
    this.mHandler.sendEmptyMessage(2);
    this.aq = true;
    this.aU.s();
  }

  public final Object onRetainNonConfigurationInstance()
  {
    int i = 0;
    if (this.aX)
      b(true);
    m localm = this.aU;
    ArrayList localArrayList;
    if (localm.bm != null)
    {
      int k = 0;
      localArrayList = null;
      if (k < localm.bm.size())
      {
        Fragment localFragment = (Fragment)localm.bm.get(k);
        if ((localFragment != null) && (localFragment.aE))
        {
          if (localArrayList == null)
            localArrayList = new ArrayList();
          localArrayList.add(localFragment);
          localFragment.aF = true;
          if (localFragment.al == null)
            break label148;
        }
        label148: for (int m = localFragment.al.mIndex; ; m = -1)
        {
          localFragment.am = m;
          if (m.DEBUG)
            new StringBuilder("retainNonConfig: keeping retained ").append(localFragment);
          k++;
          break;
        }
      }
    }
    else
    {
      localArrayList = null;
    }
    int j;
    if (this.ba != null)
    {
      y[] arrayOfy = new y[this.ba.size()];
      this.ba.values().toArray(arrayOfy);
      j = 0;
      if (i < arrayOfy.length)
      {
        y localy = arrayOfy[i];
        if (localy.aF)
          j = 1;
        while (true)
        {
          i++;
          break;
          localy.K();
          this.ba.remove(localy.aj);
        }
      }
    }
    else
    {
      j = 0;
    }
    if ((localArrayList == null) && (j == 0))
      return null;
    j localj = new j();
    localj.bd = null;
    localj.be = null;
    localj.bf = null;
    localj.bg = localArrayList;
    localj.bh = this.ba;
    return localj;
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.aU.v();
    if (localParcelable != null)
      paramBundle.putParcelable("android:support:fragments", localParcelable);
  }

  protected void onStart()
  {
    super.onStart();
    this.aX = false;
    this.aY = false;
    this.mHandler.removeMessages(1);
    if (!this.aW)
    {
      this.aW = true;
      this.aU.x();
    }
    this.aU.by = false;
    this.aU.s();
    y[] arrayOfy;
    if (!this.aQ)
    {
      this.aQ = true;
      if (this.aP != null)
      {
        this.aP.F();
        this.aR = true;
      }
    }
    else
    {
      this.aU.y();
      if (this.ba == null)
        return;
      arrayOfy = new y[this.ba.size()];
      this.ba.values().toArray(arrayOfy);
    }
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfy.length)
        return;
      y localy = arrayOfy[i];
      if (localy.aF)
      {
        if (y.DEBUG)
          new StringBuilder("Finished Retaining in ").append(localy);
        localy.aF = false;
        int j = -1 + localy.cd.size();
        while (true)
          if (j >= 0)
          {
            z localz = (z)localy.cd.valueAt(j);
            if (localz.aF)
            {
              if (y.DEBUG)
                new StringBuilder("  Finished Retaining: ").append(localz);
              localz.aF = false;
              if ((localz.cf != localz.cm) && (!localz.cf))
                localz.stop();
            }
            if ((localz.cf) && (localz.ck) && (!localz.cn))
              localz.a(localz.cj, localz.mData);
            j--;
            continue;
            if (this.aR)
              break;
            this.aP = c(null);
            if ((this.aP == null) || (this.aP.cf))
              break;
            this.aP.F();
            break;
          }
      }
      localy.J();
    }
  }

  protected void onStop()
  {
    super.onStop();
    this.aX = true;
    this.mHandler.sendEmptyMessage(1);
    this.aU.dispatchStop();
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0))
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentActivity
 * JD-Core Version:    0.6.2
 */