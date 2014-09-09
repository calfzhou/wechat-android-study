package com.tencent.mm.ui.chatting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.aj;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.f.b;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.dt;
import com.tencent.mm.ui.tools.du;

public class ShortVideoRecorderView extends FrameLayout
  implements du
{
  private String cEh = null;
  private String dFC = null;
  private ProgressDialog dWT = null;
  private TextView eSD;
  private ImageView eTP;
  private ay enI = new ay(new nw(this), true);
  private long enp = -1L;
  private String gNM = null;
  private String gNN = null;
  SurfaceHolder.Callback gNR = new od(this);
  private String gNp = null;
  private SurfaceView gNt = null;
  private SurfaceHolder gNu = null;
  private b gNv;
  private dt jbp;
  private float jfK = 0.0F;
  private TextView jvJ;
  private ImageView jvK;
  private ImageButton jvL;
  private boolean jvM = false;
  private long jvN = -1L;
  private og jvO = og.jvW;
  private boolean jvP = false;
  private of jvQ;
  private g jvR = new nv(this);

  public ShortVideoRecorderView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public ShortVideoRecorderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ShortVideoRecorderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    long l1 = System.currentTimeMillis();
    inflate(getContext(), k.cBD, this);
    long l2 = System.currentTimeMillis();
    this.gNt = ((SurfaceView)findViewById(i.aSm));
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(System.currentTimeMillis() - l2);
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "inflate view use %dms", arrayOfObject1);
    long l3 = System.currentTimeMillis();
    this.jbp = new dt(getContext());
    this.jbp.a(this);
    this.gNu = this.gNt.getHolder();
    this.gNu.addCallback(this.gNR);
    this.gNu.setType(3);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(System.currentTimeMillis() - l3);
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "init surface holder use %dms", arrayOfObject2);
    long l4 = System.currentTimeMillis();
    this.gNv = new b();
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Long.valueOf(System.currentTimeMillis() - l4);
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "create scene video use %dms", arrayOfObject3);
    long l5 = System.currentTimeMillis();
    this.eSD = ((TextView)findViewById(i.aSX));
    this.eTP = ((ImageView)findViewById(i.cin));
    this.jvK = ((ImageView)findViewById(i.cis));
    this.jvL = ((ImageButton)findViewById(i.cAG));
    this.jvL.setOnClickListener(new nx(this));
    this.jvJ = ((TextView)findViewById(i.aVu));
    this.jvJ.setOnTouchListener(new ny(this));
    Object[] arrayOfObject4 = new Object[1];
    arrayOfObject4[0] = Long.valueOf(System.currentTimeMillis() - l5);
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "init concrol view use %dms", arrayOfObject4);
    b localb = this.gNv;
    localb.a(false, "", "", "", "", 1);
    Object[] arrayOfObject5 = new Object[1];
    arrayOfObject5[0] = Long.valueOf(System.currentTimeMillis() - l1);
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "init view use %dms", arrayOfObject5);
  }

  private void aWz()
  {
    z.i("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "try close camera");
    this.eTP.setVisibility(0);
    bg.qQ().n(new oc(this));
  }

  private void releaseWakeLock()
  {
    this.gNt.setKeepScreenOn(false);
  }

  public final void aWm()
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "on fling up");
  }

  public final void aWn()
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "on fling right");
  }

  public final void aWo()
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "on fling left");
  }

  public final void aWp()
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "on fling down");
    hide();
  }

  public final boolean aWy()
  {
    return this.jvP;
  }

  public final void ad(float paramFloat)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Float.valueOf(paramFloat);
    z.v("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "update progress %f", arrayOfObject);
    if (paramFloat < 0.0F)
    {
      this.jvK.setPadding(0, 0, 0, 0);
      return;
    }
    if (paramFloat > 1.0F)
    {
      int j = -1 + getResources().getDisplayMetrics().widthPixels / 2;
      this.jvK.setPadding(j, 0, j, 0);
      return;
    }
    int i = (int)(paramFloat * getResources().getDisplayMetrics().widthPixels / 2.0F);
    this.jvK.setPadding(i, 0, i, 0);
  }

  public final void bJ(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.cEh;
    arrayOfObject[1] = paramString;
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "changed talker from %s to %s", arrayOfObject);
    this.cEh = paramString;
  }

  public final void hide()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(this.jvP);
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "hide recoder view, last time show %B", arrayOfObject);
    setVisibility(8);
    this.jvP = false;
    aWz();
    bg.ii().resume();
    bg.ij().kG();
    if (this.jvQ != null);
  }

  protected void onAttachedToWindow()
  {
    z.i("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "on attached from window");
    super.onAttachedToWindow();
    a.aGB().a("ChattingUIStatusChanged", this.jvR);
  }

  protected void onDetachedFromWindow()
  {
    z.i("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "on detached from window");
    super.onDetachedFromWindow();
    a.aGB().b("ChattingUIStatusChanged", this.jvR);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((!this.jvM) && (paramMotionEvent.getAction() == 0))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(SystemClock.elapsedRealtime() - this.jvN);
      z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "check double click %dms", arrayOfObject);
      if (SystemClock.elapsedRealtime() - this.jvN < 400L)
        this.gNv.azs();
      this.jvN = SystemClock.elapsedRealtime();
    }
    this.jbp.onTouchEvent(paramMotionEvent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ShortVideoRecorderView
 * JD-Core Version:    0.6.2
 */