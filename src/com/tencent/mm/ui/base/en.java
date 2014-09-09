package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.f;
import com.tencent.mm.g;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.e;
import java.lang.reflect.Field;

public final class en extends Toast
{
  private final Context context;
  private final ay dHm = new ay(new eo(this), true);
  private long eTX;
  private int fbH;
  private View jcV;
  private final TextView jcW;
  private int level;

  public en(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    reset();
    this.jcV = View.inflate(paramContext, k.boJ, null);
    setView(this.jcV);
    setGravity(55, 0, e.a(paramContext, 40.0F));
    setDuration(0);
    this.jcW = ((TextView)this.jcV.findViewById(i.aTp));
    switch (this.level)
    {
    default:
      return;
    case 1:
      this.jcW.setTextColor(-1);
      return;
    case 2:
    }
    this.jcW.setTextColor(this.context.getResources().getColor(f.OZ));
  }

  public static cn a(Activity paramActivity, int paramInt, String paramString)
  {
    return a(paramActivity, paramInt, paramString, true, 2000L, null);
  }

  public static cn a(Activity paramActivity, int paramInt, String paramString, boolean paramBoolean, long paramLong, View.OnClickListener paramOnClickListener)
  {
    View localView = View.inflate(paramActivity, k.bhc, null);
    TextView localTextView = (TextView)localView.findViewById(i.aAi);
    localTextView.setText(paramString);
    localTextView.setOnClickListener(paramOnClickListener);
    ImageView localImageView = (ImageView)localView.findViewById(i.aAh);
    if (paramInt == 0)
      localImageView.setVisibility(8);
    while (true)
    {
      cn localcn = new cn(localView);
      localcn.setWidth(-1);
      localcn.setHeight(-2);
      Rect localRect = new Rect();
      paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      int i = localRect.top;
      int j = co(paramActivity);
      if (i == 0)
        i = cr(paramActivity);
      localcn.showAtLocation(paramActivity.getWindow().getDecorView(), 48, 0, i + j);
      er localer = new er(localcn);
      ImageButton localImageButton = (ImageButton)localView.findViewById(i.aAg);
      localImageButton.setVisibility(8);
      localImageButton.setOnClickListener(new es(localcn));
      if (paramBoolean)
        localer.sendEmptyMessageDelayed(0, 2000L);
      return localcn;
      localImageView.setImageResource(paramInt);
    }
  }

  public static cn a(Activity paramActivity, String paramString, long paramLong)
  {
    View localView = View.inflate(paramActivity, k.boJ, null);
    ((TextView)localView.findViewById(i.aTp)).setText(paramString);
    cn localcn = new cn(localView);
    localcn.setWidth(-1);
    localcn.setHeight(-2);
    Rect localRect = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    int i = localRect.top;
    int j = co(paramActivity);
    localcn.showAtLocation(paramActivity.getWindow().getDecorView(), 48, 0, i + j);
    new ep(localcn).sendEmptyMessageDelayed(0, paramLong);
    return localcn;
  }

  public static cn b(Activity paramActivity, View paramView)
  {
    cn localcn = new cn(paramView);
    localcn.setWidth(-1);
    localcn.setHeight(-2);
    Rect localRect = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    int i = localRect.top;
    int j = co(paramActivity);
    localcn.showAtLocation(paramActivity.getWindow().getDecorView(), 48, 0, i + j);
    new eq(localcn).sendEmptyMessageDelayed(0, 4000L);
    return localcn;
  }

  private static int co(Context paramContext)
  {
    if (((paramContext instanceof ActionBarActivity)) && (((ActionBarActivity)paramContext).aM() != null))
      return ((ActionBarActivity)paramContext).aM().getHeight();
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
      return paramContext.getResources().getDimensionPixelSize(g.Pr);
    return paramContext.getResources().getDimensionPixelSize(g.Ps);
  }

  public static void cp(Context paramContext)
  {
    if (m.getExternalStorageState().equals("mounted_ro"))
    {
      et.H(paramContext, 3);
      return;
    }
    et.H(paramContext, 1);
  }

  public static void cq(Context paramContext)
  {
    et.H(paramContext, 2);
  }

  public static int cr(Context paramContext)
  {
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int i = Integer.parseInt(localClass.getField("status_bar_height").get(localObject).toString());
      int j = paramContext.getResources().getDimensionPixelSize(i);
      return j;
    }
    catch (Exception localException)
    {
    }
    return 25;
  }

  private void reset()
  {
    this.level = 1;
    this.eTX = 2000L;
    this.fbH = (1 + (int)(this.eTX / 70L));
  }

  public final void aSS()
  {
    this.eTX = 1000L;
  }

  public final void aST()
  {
    cancel();
    this.dHm.aNu();
    reset();
  }

  public final void aSU()
  {
    cancel();
    this.dHm.aNu();
    this.fbH = (1 + (int)(this.eTX / 70L));
    this.dHm.cP(70L);
  }

  public final void setText(int paramInt)
  {
    this.jcW.setText(paramInt);
  }

  public final void setText(CharSequence paramCharSequence)
  {
    this.jcW.setText(paramCharSequence);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.en
 * JD-Core Version:    0.6.2
 */