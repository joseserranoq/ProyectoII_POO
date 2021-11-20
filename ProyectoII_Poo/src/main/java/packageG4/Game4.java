package packageG4;
import Classes.GameFunction;
import Classes.Stat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Esta clase que es un JInternalFrame es la encargada de tener todos los metodos
 * necesarios para mostrar el juego Forma la X, el usuario debe formar una X con
 * los JRadioButton de 18x18 para terminar el juego.
 * @author Warren Ivan Alvarez Huete
 * @version 1.0
 * @see Game4
 */
public class Game4 extends javax.swing.JInternalFrame implements GameFunction {

    /**
     * Esta clase posee un timer que se utiliza en el juego para mostrar por medio de un
     * JLabel la cantidad de segundos que han pasado si se inicia el juego.
     */
    Timer tiempoJuego;
    public Game4() {
        
    }
    
    /**
     * Metodo para iniciar el JInternalFrame por defecto.
     */
    
    /**
     * Metodo para recuperar los Stats del juego.
     * 
     * @return Regresa los Stats obtenidos del juego.
     */
        @Override
    public void startG() {
        initComponents();
    }
    
    public Stat getStats(){
        Stat nuevoStat= new Stat("segundos",lblNombreJugadorIngresado.getText(),
                Integer.parseInt(lblInicioContador.getText()));
        return nuevoStat;
    }
    
    /**
     * Hace que el jugador deba esperar un tiempo antes de jugar, gracias a un timer
     * se encargara de que pase el tiempo, el usuario no podra iniciar otro juego
     * hasta que pase el tiempo solicitado.
     * 
     * @param textoEsperarJuego Un texto, sera el responsable de mostrar un texto
     * en el JOptionPane.
     * 
     * @param textoTitulo Un texto, sera el responsable de mostrar un texto en
     * el titulo del JOptionPane.
     * 
     * @param tiempoEsperar Un tiempo, es la cantidad de segundos que el usuario
     * debera esperar antes de comenzar a jugar.
     * 
     */
    
    public void esperarJuego(String textoEsperarJuego, String textoTitulo, int tiempoEsperar){
        final JOptionPane esperarTiempo = new JOptionPane(textoEsperarJuego, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

        final JDialog dialogoEsperar = new JDialog();
        dialogoEsperar.setTitle(textoTitulo);
        dialogoEsperar.setModal(true);

        dialogoEsperar.setContentPane(esperarTiempo);

        dialogoEsperar.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialogoEsperar.pack();

        Timer timer = new Timer(tiempoEsperar, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dialogoEsperar.dispose();
            }
        });
        timer.setRepeats(false);

        timer.start();

        dialogoEsperar.setVisible(true);
    }
    
int tiempoTranscurrido=1;

    /**
     * Realizara el conteo con una variable global llamada tiempoTranscurrido y
     * este sera utilizado por un timer.
     */

    public void iniciarConteo(){

        tiempoJuego=new Timer(1000, new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                lblInicioContador.setText(String.valueOf(tiempoTranscurrido));
                tiempoTranscurrido++;
            }
        });
        tiempoJuego.start();
    }
    
    

    /**
     * Codigo generado por NetBeans donde viene cada objeto utilizado.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreJugador = new javax.swing.JLabel();
        lblNombreJugadorIngresado = new javax.swing.JLabel();
        botonIngresarNombre = new javax.swing.JButton();
        botonIniciarJuego = new javax.swing.JButton();
        lblInicioContador = new javax.swing.JLabel();
        lblTiempoJuego = new javax.swing.JLabel();
        botonTerminarJuego = new javax.swing.JButton();
        panelRB = new javax.swing.JPanel();
        radioButtonFalso242 = new javax.swing.JRadioButton();
        radioButtonFalso122 = new javax.swing.JRadioButton();
        radioButtonFalso243 = new javax.swing.JRadioButton();
        radioButtonFalso2 = new javax.swing.JRadioButton();
        radioButtonFalso123 = new javax.swing.JRadioButton();
        radioButtonFalso244 = new javax.swing.JRadioButton();
        radioButtonFalso3 = new javax.swing.JRadioButton();
        radioButtonFalso124 = new javax.swing.JRadioButton();
        radioButtonCorrecto31 = new javax.swing.JRadioButton();
        radioButtonFalso4 = new javax.swing.JRadioButton();
        radioButtonFalso125 = new javax.swing.JRadioButton();
        radioButtonFalso246 = new javax.swing.JRadioButton();
        radioButtonFalso5 = new javax.swing.JRadioButton();
        radioButtonFalso126 = new javax.swing.JRadioButton();
        radioButtonFalso247 = new javax.swing.JRadioButton();
        radioButtonFalso6 = new javax.swing.JRadioButton();
        radioButtonFalso127 = new javax.swing.JRadioButton();
        radioButtonFalso248 = new javax.swing.JRadioButton();
        radioButtonFalso7 = new javax.swing.JRadioButton();
        radioButtonFalso128 = new javax.swing.JRadioButton();
        radioButtonFalso249 = new javax.swing.JRadioButton();
        radioButtonFalso8 = new javax.swing.JRadioButton();
        radioButtonFalso129 = new javax.swing.JRadioButton();
        radioButtonFalso250 = new javax.swing.JRadioButton();
        radioButtonFalso9 = new javax.swing.JRadioButton();
        radioButtonFalso130 = new javax.swing.JRadioButton();
        radioButtonFalso251 = new javax.swing.JRadioButton();
        radioButtonFalso10 = new javax.swing.JRadioButton();
        radioButtonFalso131 = new javax.swing.JRadioButton();
        radioButtonFalso11 = new javax.swing.JRadioButton();
        radioButtonCorrecto14 = new javax.swing.JRadioButton();
        radioButtonFalso132 = new javax.swing.JRadioButton();
        radioButtonFalso253 = new javax.swing.JRadioButton();
        radioButtonFalso12 = new javax.swing.JRadioButton();
        radioButtonCorrecto25 = new javax.swing.JRadioButton();
        radioButtonFalso254 = new javax.swing.JRadioButton();
        radioButtonFalso13 = new javax.swing.JRadioButton();
        radioButtonFalso134 = new javax.swing.JRadioButton();
        radioButtonFalso255 = new javax.swing.JRadioButton();
        radioButtonFalso14 = new javax.swing.JRadioButton();
        radioButtonFalso135 = new javax.swing.JRadioButton();
        radioButtonFalso256 = new javax.swing.JRadioButton();
        radioButtonCorrecto = new javax.swing.JRadioButton();
        radioButtonFalso136 = new javax.swing.JRadioButton();
        radioButtonFalso257 = new javax.swing.JRadioButton();
        radioButtonFalso16 = new javax.swing.JRadioButton();
        radioButtonFalso137 = new javax.swing.JRadioButton();
        radioButtonFalso258 = new javax.swing.JRadioButton();
        radioButtonFalso17 = new javax.swing.JRadioButton();
        radioButtonFalso138 = new javax.swing.JRadioButton();
        radioButtonFalso259 = new javax.swing.JRadioButton();
        radioButtonFalso18 = new javax.swing.JRadioButton();
        radioButtonFalso139 = new javax.swing.JRadioButton();
        radioButtonFalso260 = new javax.swing.JRadioButton();
        radioButtonFalso19 = new javax.swing.JRadioButton();
        radioButtonFalso140 = new javax.swing.JRadioButton();
        radioButtonFalso261 = new javax.swing.JRadioButton();
        radioButtonFalso20 = new javax.swing.JRadioButton();
        radioButtonFalso141 = new javax.swing.JRadioButton();
        radioButtonFalso21 = new javax.swing.JRadioButton();
        radioButtonFalso262 = new javax.swing.JRadioButton();
        radioButtonFalso142 = new javax.swing.JRadioButton();
        radioButtonFalso263 = new javax.swing.JRadioButton();
        radioButtonFalso22 = new javax.swing.JRadioButton();
        radioButtonCorrecto7 = new javax.swing.JRadioButton();
        radioButtonCorrecto32 = new javax.swing.JRadioButton();
        radioButtonFalso23 = new javax.swing.JRadioButton();
        radioButtonFalso144 = new javax.swing.JRadioButton();
        radioButtonFalso265 = new javax.swing.JRadioButton();
        radioButtonFalso24 = new javax.swing.JRadioButton();
        radioButtonFalso145 = new javax.swing.JRadioButton();
        radioButtonFalso266 = new javax.swing.JRadioButton();
        radioButtonFalso25 = new javax.swing.JRadioButton();
        radioButtonCorrecto8 = new javax.swing.JRadioButton();
        radioButtonFalso267 = new javax.swing.JRadioButton();
        radioButtonFalso26 = new javax.swing.JRadioButton();
        radioButtonFalso147 = new javax.swing.JRadioButton();
        radioButtonFalso268 = new javax.swing.JRadioButton();
        radioButtonCorrecto19 = new javax.swing.JRadioButton();
        radioButtonFalso148 = new javax.swing.JRadioButton();
        radioButtonFalso269 = new javax.swing.JRadioButton();
        radioButtonFalso28 = new javax.swing.JRadioButton();
        radioButtonFalso149 = new javax.swing.JRadioButton();
        radioButtonFalso270 = new javax.swing.JRadioButton();
        radioButtonFalso29 = new javax.swing.JRadioButton();
        radioButtonFalso150 = new javax.swing.JRadioButton();
        radioButtonFalso271 = new javax.swing.JRadioButton();
        radioButtonFalso30 = new javax.swing.JRadioButton();
        radioButtonFalso151 = new javax.swing.JRadioButton();
        radioButtonFalso31 = new javax.swing.JRadioButton();
        radioButtonCorrecto26 = new javax.swing.JRadioButton();
        radioButtonFalso32 = new javax.swing.JRadioButton();
        radioButtonFalso153 = new javax.swing.JRadioButton();
        radioButtonCorrecto1 = new javax.swing.JRadioButton();
        radioButtonFalso154 = new javax.swing.JRadioButton();
        radioButtonFalso34 = new javax.swing.JRadioButton();
        radioButtonFalso155 = new javax.swing.JRadioButton();
        radioButtonFalso35 = new javax.swing.JRadioButton();
        radioButtonFalso156 = new javax.swing.JRadioButton();
        radioButtonFalso36 = new javax.swing.JRadioButton();
        radioButtonFalso157 = new javax.swing.JRadioButton();
        radioButtonFalso37 = new javax.swing.JRadioButton();
        radioButtonFalso158 = new javax.swing.JRadioButton();
        radioButtonFalso38 = new javax.swing.JRadioButton();
        radioButtonFalso159 = new javax.swing.JRadioButton();
        radioButtonFalso39 = new javax.swing.JRadioButton();
        radioButtonFalso160 = new javax.swing.JRadioButton();
        radioButtonFalso40 = new javax.swing.JRadioButton();
        radioButtonFalso161 = new javax.swing.JRadioButton();
        radioButtonFalso41 = new javax.swing.JRadioButton();
        radioButtonFalso162 = new javax.swing.JRadioButton();
        radioButtonFalso42 = new javax.swing.JRadioButton();
        radioButtonFalso163 = new javax.swing.JRadioButton();
        radioButtonFalso43 = new javax.swing.JRadioButton();
        radioButtonCorrecto27 = new javax.swing.JRadioButton();
        radioButtonFalso44 = new javax.swing.JRadioButton();
        radioButtonFalso165 = new javax.swing.JRadioButton();
        radioButtonFalso45 = new javax.swing.JRadioButton();
        radioButtonFalso166 = new javax.swing.JRadioButton();
        radioButtonFalso46 = new javax.swing.JRadioButton();
        radioButtonFalso167 = new javax.swing.JRadioButton();
        radioButtonFalso47 = new javax.swing.JRadioButton();
        radioButtonFalso168 = new javax.swing.JRadioButton();
        radioButtonFalso48 = new javax.swing.JRadioButton();
        radioButtonFalso169 = new javax.swing.JRadioButton();
        radioButtonCorrecto2 = new javax.swing.JRadioButton();
        radioButtonCorrecto9 = new javax.swing.JRadioButton();
        radioButtonFalso50 = new javax.swing.JRadioButton();
        radioButtonFalso171 = new javax.swing.JRadioButton();
        radioButtonFalso51 = new javax.swing.JRadioButton();
        radioButtonCorrecto20 = new javax.swing.JRadioButton();
        radioButtonFalso53 = new javax.swing.JRadioButton();
        radioButtonCorrecto21 = new javax.swing.JRadioButton();
        radioButtonFalso55 = new javax.swing.JRadioButton();
        radioButtonFalso56 = new javax.swing.JRadioButton();
        radioButtonFalso57 = new javax.swing.JRadioButton();
        radioButtonFalso58 = new javax.swing.JRadioButton();
        radioButtonFalso59 = new javax.swing.JRadioButton();
        radioButtonFalso60 = new javax.swing.JRadioButton();
        radioButtonFalso61 = new javax.swing.JRadioButton();
        radioButtonFalso62 = new javax.swing.JRadioButton();
        radioButtonFalso63 = new javax.swing.JRadioButton();
        radioButtonFalso64 = new javax.swing.JRadioButton();
        radioButtonFalso65 = new javax.swing.JRadioButton();
        radioButtonCorrecto3 = new javax.swing.JRadioButton();
        radioButtonFalso67 = new javax.swing.JRadioButton();
        radioButtonFalso68 = new javax.swing.JRadioButton();
        radioButtonFalso69 = new javax.swing.JRadioButton();
        radioButtonFalso70 = new javax.swing.JRadioButton();
        radioButtonFalso71 = new javax.swing.JRadioButton();
        radioButtonFalso272 = new javax.swing.JRadioButton();
        radioButtonFalso273 = new javax.swing.JRadioButton();
        radioButtonFalso274 = new javax.swing.JRadioButton();
        radioButtonFalso275 = new javax.swing.JRadioButton();
        radioButtonFalso276 = new javax.swing.JRadioButton();
        radioButtonFalso277 = new javax.swing.JRadioButton();
        radioButtonFalso278 = new javax.swing.JRadioButton();
        radioButtonFalso279 = new javax.swing.JRadioButton();
        radioButtonFalso280 = new javax.swing.JRadioButton();
        radioButtonFalso281 = new javax.swing.JRadioButton();
        radioButtonFalso282 = new javax.swing.JRadioButton();
        radioButtonCorrecto33 = new javax.swing.JRadioButton();
        radioButtonFalso284 = new javax.swing.JRadioButton();
        radioButtonFalso285 = new javax.swing.JRadioButton();
        radioButtonCorrecto15 = new javax.swing.JRadioButton();
        radioButtonFalso287 = new javax.swing.JRadioButton();
        radioButtonFalso288 = new javax.swing.JRadioButton();
        radioButtonFalso289 = new javax.swing.JRadioButton();
        radioButtonFalso290 = new javax.swing.JRadioButton();
        radioButtonFalso291 = new javax.swing.JRadioButton();
        radioButtonFalso292 = new javax.swing.JRadioButton();
        radioButtonFalso172 = new javax.swing.JRadioButton();
        radioButtonFalso293 = new javax.swing.JRadioButton();
        radioButtonFalso173 = new javax.swing.JRadioButton();
        radioButtonFalso294 = new javax.swing.JRadioButton();
        radioButtonFalso174 = new javax.swing.JRadioButton();
        radioButtonFalso295 = new javax.swing.JRadioButton();
        radioButtonFalso175 = new javax.swing.JRadioButton();
        radioButtonFalso296 = new javax.swing.JRadioButton();
        radioButtonFalso176 = new javax.swing.JRadioButton();
        radioButtonCorrecto16 = new javax.swing.JRadioButton();
        radioButtonFalso177 = new javax.swing.JRadioButton();
        radioButtonFalso298 = new javax.swing.JRadioButton();
        radioButtonFalso178 = new javax.swing.JRadioButton();
        radioButtonFalso299 = new javax.swing.JRadioButton();
        radioButtonFalso179 = new javax.swing.JRadioButton();
        radioButtonFalso300 = new javax.swing.JRadioButton();
        radioButtonFalso180 = new javax.swing.JRadioButton();
        radioButtonFalso301 = new javax.swing.JRadioButton();
        radioButtonFalso181 = new javax.swing.JRadioButton();
        radioButtonFalso302 = new javax.swing.JRadioButton();
        radioButtonFalso182 = new javax.swing.JRadioButton();
        radioButtonCorrecto34 = new javax.swing.JRadioButton();
        radioButtonFalso183 = new javax.swing.JRadioButton();
        radioButtonFalso304 = new javax.swing.JRadioButton();
        radioButtonFalso184 = new javax.swing.JRadioButton();
        radioButtonFalso305 = new javax.swing.JRadioButton();
        radioButtonFalso185 = new javax.swing.JRadioButton();
        radioButtonFalso306 = new javax.swing.JRadioButton();
        radioButtonFalso186 = new javax.swing.JRadioButton();
        radioButtonCorrecto35 = new javax.swing.JRadioButton();
        radioButtonCorrecto10 = new javax.swing.JRadioButton();
        radioButtonFalso308 = new javax.swing.JRadioButton();
        radioButtonFalso188 = new javax.swing.JRadioButton();
        radioButtonFalso309 = new javax.swing.JRadioButton();
        radioButtonFalso189 = new javax.swing.JRadioButton();
        radioButtonFalso310 = new javax.swing.JRadioButton();
        radioButtonFalso190 = new javax.swing.JRadioButton();
        radioButtonFalso311 = new javax.swing.JRadioButton();
        radioButtonFalso191 = new javax.swing.JRadioButton();
        radioButtonFalso312 = new javax.swing.JRadioButton();
        radioButtonFalso192 = new javax.swing.JRadioButton();
        radioButtonFalso313 = new javax.swing.JRadioButton();
        radioButtonFalso72 = new javax.swing.JRadioButton();
        radioButtonFalso193 = new javax.swing.JRadioButton();
        radioButtonFalso314 = new javax.swing.JRadioButton();
        radioButtonFalso73 = new javax.swing.JRadioButton();
        radioButtonFalso194 = new javax.swing.JRadioButton();
        radioButtonFalso315 = new javax.swing.JRadioButton();
        radioButtonFalso74 = new javax.swing.JRadioButton();
        radioButtonFalso195 = new javax.swing.JRadioButton();
        radioButtonFalso316 = new javax.swing.JRadioButton();
        radioButtonCorrecto22 = new javax.swing.JRadioButton();
        radioButtonFalso196 = new javax.swing.JRadioButton();
        radioButtonFalso317 = new javax.swing.JRadioButton();
        radioButtonFalso76 = new javax.swing.JRadioButton();
        radioButtonCorrecto28 = new javax.swing.JRadioButton();
        radioButtonFalso318 = new javax.swing.JRadioButton();
        radioButtonFalso77 = new javax.swing.JRadioButton();
        radioButtonFalso198 = new javax.swing.JRadioButton();
        radioButtonFalso319 = new javax.swing.JRadioButton();
        radioButtonFalso78 = new javax.swing.JRadioButton();
        radioButtonFalso199 = new javax.swing.JRadioButton();
        radioButtonCorrecto17 = new javax.swing.JRadioButton();
        radioButtonFalso79 = new javax.swing.JRadioButton();
        radioButtonFalso200 = new javax.swing.JRadioButton();
        radioButtonFalso321 = new javax.swing.JRadioButton();
        radioButtonFalso80 = new javax.swing.JRadioButton();
        radioButtonFalso201 = new javax.swing.JRadioButton();
        radioButtonFalso81 = new javax.swing.JRadioButton();
        radioButtonFalso322 = new javax.swing.JRadioButton();
        radioButtonCorrecto29 = new javax.swing.JRadioButton();
        radioButtonFalso323 = new javax.swing.JRadioButton();
        radioButtonFalso82 = new javax.swing.JRadioButton();
        radioButtonFalso203 = new javax.swing.JRadioButton();
        radioButtonCorrecto4 = new javax.swing.JRadioButton();
        radioButtonCorrecto11 = new javax.swing.JRadioButton();
        radioButtonFalso84 = new javax.swing.JRadioButton();
        radioButtonFalso205 = new javax.swing.JRadioButton();
        radioButtonFalso85 = new javax.swing.JRadioButton();
        radioButtonFalso206 = new javax.swing.JRadioButton();
        radioButtonFalso86 = new javax.swing.JRadioButton();
        radioButtonFalso207 = new javax.swing.JRadioButton();
        radioButtonFalso87 = new javax.swing.JRadioButton();
        radioButtonFalso208 = new javax.swing.JRadioButton();
        radioButtonFalso88 = new javax.swing.JRadioButton();
        radioButtonFalso209 = new javax.swing.JRadioButton();
        radioButtonFalso89 = new javax.swing.JRadioButton();
        radioButtonFalso210 = new javax.swing.JRadioButton();
        radioButtonFalso90 = new javax.swing.JRadioButton();
        radioButtonFalso211 = new javax.swing.JRadioButton();
        radioButtonFalso91 = new javax.swing.JRadioButton();
        radioButtonFalso212 = new javax.swing.JRadioButton();
        radioButtonFalso92 = new javax.swing.JRadioButton();
        radioButtonFalso213 = new javax.swing.JRadioButton();
        radioButtonFalso93 = new javax.swing.JRadioButton();
        radioButtonFalso214 = new javax.swing.JRadioButton();
        radioButtonFalso94 = new javax.swing.JRadioButton();
        radioButtonFalso215 = new javax.swing.JRadioButton();
        radioButtonCorrecto23 = new javax.swing.JRadioButton();
        radioButtonFalso216 = new javax.swing.JRadioButton();
        radioButtonFalso96 = new javax.swing.JRadioButton();
        radioButtonFalso217 = new javax.swing.JRadioButton();
        radioButtonFalso97 = new javax.swing.JRadioButton();
        radioButtonFalso218 = new javax.swing.JRadioButton();
        radioButtonFalso98 = new javax.swing.JRadioButton();
        radioButtonFalso219 = new javax.swing.JRadioButton();
        radioButtonFalso99 = new javax.swing.JRadioButton();
        radioButtonFalso220 = new javax.swing.JRadioButton();
        radioButtonCorrecto5 = new javax.swing.JRadioButton();
        radioButtonCorrecto12 = new javax.swing.JRadioButton();
        radioButtonFalso101 = new javax.swing.JRadioButton();
        radioButtonFalso222 = new javax.swing.JRadioButton();
        radioButtonFalso102 = new javax.swing.JRadioButton();
        radioButtonFalso223 = new javax.swing.JRadioButton();
        radioButtonFalso103 = new javax.swing.JRadioButton();
        radioButtonFalso224 = new javax.swing.JRadioButton();
        radioButtonFalso104 = new javax.swing.JRadioButton();
        radioButtonFalso225 = new javax.swing.JRadioButton();
        radioButtonFalso105 = new javax.swing.JRadioButton();
        radioButtonCorrecto30 = new javax.swing.JRadioButton();
        radioButtonFalso106 = new javax.swing.JRadioButton();
        radioButtonFalso227 = new javax.swing.JRadioButton();
        radioButtonFalso107 = new javax.swing.JRadioButton();
        radioButtonFalso228 = new javax.swing.JRadioButton();
        radioButtonFalso108 = new javax.swing.JRadioButton();
        radioButtonFalso229 = new javax.swing.JRadioButton();
        radioButtonFalso109 = new javax.swing.JRadioButton();
        radioButtonFalso230 = new javax.swing.JRadioButton();
        radioButtonFalso110 = new javax.swing.JRadioButton();
        radioButtonFalso231 = new javax.swing.JRadioButton();
        radioButtonFalso111 = new javax.swing.JRadioButton();
        radioButtonFalso232 = new javax.swing.JRadioButton();
        radioButtonCorrecto6 = new javax.swing.JRadioButton();
        radioButtonFalso233 = new javax.swing.JRadioButton();
        radioButtonFalso113 = new javax.swing.JRadioButton();
        radioButtonFalso234 = new javax.swing.JRadioButton();
        radioButtonCorrecto24 = new javax.swing.JRadioButton();
        radioButtonFalso235 = new javax.swing.JRadioButton();
        radioButtonFalso115 = new javax.swing.JRadioButton();
        radioButtonFalso236 = new javax.swing.JRadioButton();
        radioButtonFalso116 = new javax.swing.JRadioButton();
        radioButtonCorrecto13 = new javax.swing.JRadioButton();
        radioButtonFalso117 = new javax.swing.JRadioButton();
        radioButtonFalso238 = new javax.swing.JRadioButton();
        radioButtonFalso118 = new javax.swing.JRadioButton();
        radioButtonFalso239 = new javax.swing.JRadioButton();
        radioButtonFalso119 = new javax.swing.JRadioButton();
        radioButtonFalso240 = new javax.swing.JRadioButton();
        radioButtonFalso120 = new javax.swing.JRadioButton();
        radioButtonFalso241 = new javax.swing.JRadioButton();
        radioButtonFalso = new javax.swing.JRadioButton();
        radioButtonFalso121 = new javax.swing.JRadioButton();
        radioButtonCorrecto18 = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Forma la X");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lblNombreJugador.setText("Nombre del jugador:");

        lblNombreJugadorIngresado.setText("nombre");
        lblNombreJugadorIngresado.setToolTipText("");

        botonIngresarNombre.setText("Ingresar nombre");
        botonIngresarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarNombreActionPerformed(evt);
            }
        });

        botonIniciarJuego.setText("Iniciar juego");
        botonIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarJuegoActionPerformed(evt);
            }
        });

        lblInicioContador.setText("0");

        lblTiempoJuego.setText("Tiempo transcurrido del juego:");

        botonTerminarJuego.setText("Terminar");
        botonTerminarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarJuegoActionPerformed(evt);
            }
        });

        panelRB.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelRBLayout = new javax.swing.GroupLayout(panelRB);
        panelRB.setLayout(panelRBLayout);
        panelRBLayout.setHorizontalGroup(
            panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso302)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso304)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso288)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso291)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso293)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso294)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso295)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso296)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso290)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso305)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso292)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso298)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso299)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso300)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso301)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso289))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso284)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso279)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso270)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso273)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso275)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso276)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso277)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso278)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso272)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso287)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso274)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso280)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso281)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso282)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso285)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso271))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso266)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso261)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso268)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso255)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso257)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso258)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso259)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso260)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso254)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso269)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso256)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso262)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso263)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso265)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso267)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso253))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso248)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso243)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso250)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso234)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso239)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso240)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso241)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso242)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso236)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso251)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso238)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso244)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso246)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso247)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso249)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso235))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso230)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso225)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso232)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso216)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso219)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso222)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso223)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso224)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso218)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso233)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso220)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso227)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso228)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso229)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso231)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso217))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso212)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso207)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso214)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso198)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso201)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso203)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso205)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso206)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso200)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso215)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso208)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso209)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso210)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso211)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso213)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso199))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso194)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso189)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso196)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso180)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso183)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso185)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso186)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso188)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso182)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso184)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso190)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso191)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso192)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso193)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso195)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso181))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso176)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso178)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso162)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso165)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso167)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso168)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso169)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso179)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso166)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso173)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso174)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso175)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso163))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso160)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso144)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso147)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso149)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso150)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso151)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso161)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso148)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso154)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso155)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso156)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso157)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso145))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso135)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso142)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso132)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso134)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso130)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso138)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso139)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso141)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso127))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonCorrecto17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso315)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso322)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso306)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso309)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso311)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso312)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso313)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso314)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso308)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso323)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso310)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso316)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso317)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso318)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso319)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso321)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto35))
                    .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelRBLayout.createSequentialGroup()
                            .addComponent(radioButtonFalso32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonCorrecto19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso34)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso35)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonCorrecto1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso19))
                        .addGroup(panelRBLayout.createSequentialGroup()
                            .addComponent(radioButtonCorrecto18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonFalso13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonCorrecto)))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso124)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso120)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso109))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso91))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso73))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso55))
                    .addGroup(panelRBLayout.createSequentialGroup()
                        .addComponent(radioButtonFalso50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonCorrecto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonFalso37)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRBLayout.setVerticalGroup(
            panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso)
                    .addComponent(radioButtonCorrecto18)
                    .addComponent(radioButtonFalso2)
                    .addComponent(radioButtonFalso3)
                    .addComponent(radioButtonFalso4)
                    .addComponent(radioButtonFalso5)
                    .addComponent(radioButtonFalso6)
                    .addComponent(radioButtonFalso7)
                    .addComponent(radioButtonFalso8)
                    .addComponent(radioButtonFalso14)
                    .addComponent(radioButtonFalso16)
                    .addComponent(radioButtonFalso17)
                    .addComponent(radioButtonFalso9)
                    .addComponent(radioButtonFalso10)
                    .addComponent(radioButtonFalso11)
                    .addComponent(radioButtonFalso12)
                    .addComponent(radioButtonFalso13)
                    .addComponent(radioButtonCorrecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonCorrecto19)
                    .addComponent(radioButtonFalso32)
                    .addComponent(radioButtonFalso34)
                    .addComponent(radioButtonFalso18)
                    .addComponent(radioButtonFalso21)
                    .addComponent(radioButtonFalso23)
                    .addComponent(radioButtonFalso24)
                    .addComponent(radioButtonFalso25)
                    .addComponent(radioButtonFalso26)
                    .addComponent(radioButtonFalso35)
                    .addComponent(radioButtonFalso20)
                    .addComponent(radioButtonFalso22)
                    .addComponent(radioButtonFalso28)
                    .addComponent(radioButtonFalso29)
                    .addComponent(radioButtonFalso30)
                    .addComponent(radioButtonFalso31)
                    .addComponent(radioButtonCorrecto1)
                    .addComponent(radioButtonFalso19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso45)
                    .addComponent(radioButtonFalso50)
                    .addComponent(radioButtonCorrecto20)
                    .addComponent(radioButtonFalso36)
                    .addComponent(radioButtonFalso39)
                    .addComponent(radioButtonFalso41)
                    .addComponent(radioButtonFalso42)
                    .addComponent(radioButtonFalso43)
                    .addComponent(radioButtonFalso44)
                    .addComponent(radioButtonFalso53)
                    .addComponent(radioButtonFalso38)
                    .addComponent(radioButtonFalso40)
                    .addComponent(radioButtonFalso46)
                    .addComponent(radioButtonFalso47)
                    .addComponent(radioButtonFalso48)
                    .addComponent(radioButtonCorrecto2)
                    .addComponent(radioButtonFalso51)
                    .addComponent(radioButtonFalso37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso63)
                    .addComponent(radioButtonFalso68)
                    .addComponent(radioButtonFalso70)
                    .addComponent(radioButtonCorrecto21)
                    .addComponent(radioButtonFalso57)
                    .addComponent(radioButtonFalso59)
                    .addComponent(radioButtonFalso60)
                    .addComponent(radioButtonFalso61)
                    .addComponent(radioButtonFalso62)
                    .addComponent(radioButtonFalso71)
                    .addComponent(radioButtonFalso56)
                    .addComponent(radioButtonFalso58)
                    .addComponent(radioButtonFalso64)
                    .addComponent(radioButtonFalso65)
                    .addComponent(radioButtonCorrecto3)
                    .addComponent(radioButtonFalso67)
                    .addComponent(radioButtonFalso69)
                    .addComponent(radioButtonFalso55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso81)
                    .addComponent(radioButtonFalso86)
                    .addComponent(radioButtonFalso88)
                    .addComponent(radioButtonFalso72)
                    .addComponent(radioButtonCorrecto22)
                    .addComponent(radioButtonFalso77)
                    .addComponent(radioButtonFalso78)
                    .addComponent(radioButtonFalso79)
                    .addComponent(radioButtonFalso80)
                    .addComponent(radioButtonFalso89)
                    .addComponent(radioButtonFalso74)
                    .addComponent(radioButtonFalso76)
                    .addComponent(radioButtonFalso82)
                    .addComponent(radioButtonCorrecto4)
                    .addComponent(radioButtonFalso84)
                    .addComponent(radioButtonFalso85)
                    .addComponent(radioButtonFalso87)
                    .addComponent(radioButtonFalso73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso99)
                    .addComponent(radioButtonFalso104)
                    .addComponent(radioButtonFalso106)
                    .addComponent(radioButtonFalso90)
                    .addComponent(radioButtonFalso93)
                    .addComponent(radioButtonCorrecto23)
                    .addComponent(radioButtonFalso96)
                    .addComponent(radioButtonFalso97)
                    .addComponent(radioButtonFalso98)
                    .addComponent(radioButtonFalso107)
                    .addComponent(radioButtonFalso92)
                    .addComponent(radioButtonFalso94)
                    .addComponent(radioButtonCorrecto5)
                    .addComponent(radioButtonFalso101)
                    .addComponent(radioButtonFalso102)
                    .addComponent(radioButtonFalso103)
                    .addComponent(radioButtonFalso105)
                    .addComponent(radioButtonFalso91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso117)
                    .addComponent(radioButtonFalso122)
                    .addComponent(radioButtonFalso124)
                    .addComponent(radioButtonFalso108)
                    .addComponent(radioButtonFalso111)
                    .addComponent(radioButtonFalso113)
                    .addComponent(radioButtonCorrecto24)
                    .addComponent(radioButtonFalso115)
                    .addComponent(radioButtonFalso116)
                    .addComponent(radioButtonFalso125)
                    .addComponent(radioButtonFalso110)
                    .addComponent(radioButtonCorrecto6)
                    .addComponent(radioButtonFalso118)
                    .addComponent(radioButtonFalso119)
                    .addComponent(radioButtonFalso120)
                    .addComponent(radioButtonFalso121)
                    .addComponent(radioButtonFalso123)
                    .addComponent(radioButtonFalso109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso135)
                    .addComponent(radioButtonFalso140)
                    .addComponent(radioButtonFalso142)
                    .addComponent(radioButtonFalso126)
                    .addComponent(radioButtonFalso129)
                    .addComponent(radioButtonFalso131)
                    .addComponent(radioButtonFalso132)
                    .addComponent(radioButtonCorrecto25)
                    .addComponent(radioButtonFalso134)
                    .addComponent(radioButtonCorrecto7)
                    .addComponent(radioButtonFalso128)
                    .addComponent(radioButtonFalso130)
                    .addComponent(radioButtonFalso136)
                    .addComponent(radioButtonFalso137)
                    .addComponent(radioButtonFalso138)
                    .addComponent(radioButtonFalso139)
                    .addComponent(radioButtonFalso141)
                    .addComponent(radioButtonFalso127))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso153)
                    .addComponent(radioButtonFalso158)
                    .addComponent(radioButtonFalso160)
                    .addComponent(radioButtonFalso144)
                    .addComponent(radioButtonFalso147)
                    .addComponent(radioButtonFalso149)
                    .addComponent(radioButtonFalso150)
                    .addComponent(radioButtonFalso151)
                    .addComponent(radioButtonCorrecto26)
                    .addComponent(radioButtonFalso161)
                    .addComponent(radioButtonCorrecto8)
                    .addComponent(radioButtonFalso148)
                    .addComponent(radioButtonFalso154)
                    .addComponent(radioButtonFalso155)
                    .addComponent(radioButtonFalso156)
                    .addComponent(radioButtonFalso157)
                    .addComponent(radioButtonFalso159)
                    .addComponent(radioButtonFalso145))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso171)
                    .addComponent(radioButtonFalso176)
                    .addComponent(radioButtonFalso178)
                    .addComponent(radioButtonFalso162)
                    .addComponent(radioButtonFalso165)
                    .addComponent(radioButtonFalso167)
                    .addComponent(radioButtonFalso168)
                    .addComponent(radioButtonFalso169)
                    .addComponent(radioButtonCorrecto9)
                    .addComponent(radioButtonFalso179)
                    .addComponent(radioButtonCorrecto27)
                    .addComponent(radioButtonFalso166)
                    .addComponent(radioButtonFalso172)
                    .addComponent(radioButtonFalso173)
                    .addComponent(radioButtonFalso174)
                    .addComponent(radioButtonFalso175)
                    .addComponent(radioButtonFalso177)
                    .addComponent(radioButtonFalso163))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso189)
                    .addComponent(radioButtonFalso194)
                    .addComponent(radioButtonFalso196)
                    .addComponent(radioButtonFalso180)
                    .addComponent(radioButtonFalso183)
                    .addComponent(radioButtonFalso185)
                    .addComponent(radioButtonFalso186)
                    .addComponent(radioButtonCorrecto10)
                    .addComponent(radioButtonFalso188)
                    .addComponent(radioButtonCorrecto28)
                    .addComponent(radioButtonFalso182)
                    .addComponent(radioButtonFalso184)
                    .addComponent(radioButtonFalso190)
                    .addComponent(radioButtonFalso191)
                    .addComponent(radioButtonFalso192)
                    .addComponent(radioButtonFalso193)
                    .addComponent(radioButtonFalso195)
                    .addComponent(radioButtonFalso181))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso207)
                    .addComponent(radioButtonFalso212)
                    .addComponent(radioButtonFalso214)
                    .addComponent(radioButtonFalso198)
                    .addComponent(radioButtonFalso201)
                    .addComponent(radioButtonFalso203)
                    .addComponent(radioButtonCorrecto11)
                    .addComponent(radioButtonFalso205)
                    .addComponent(radioButtonFalso206)
                    .addComponent(radioButtonFalso215)
                    .addComponent(radioButtonFalso200)
                    .addComponent(radioButtonCorrecto29)
                    .addComponent(radioButtonFalso208)
                    .addComponent(radioButtonFalso209)
                    .addComponent(radioButtonFalso210)
                    .addComponent(radioButtonFalso211)
                    .addComponent(radioButtonFalso213)
                    .addComponent(radioButtonFalso199))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso225)
                    .addComponent(radioButtonFalso230)
                    .addComponent(radioButtonFalso232)
                    .addComponent(radioButtonFalso216)
                    .addComponent(radioButtonFalso219)
                    .addComponent(radioButtonCorrecto12)
                    .addComponent(radioButtonFalso222)
                    .addComponent(radioButtonFalso223)
                    .addComponent(radioButtonFalso224)
                    .addComponent(radioButtonFalso233)
                    .addComponent(radioButtonFalso218)
                    .addComponent(radioButtonFalso220)
                    .addComponent(radioButtonCorrecto30)
                    .addComponent(radioButtonFalso227)
                    .addComponent(radioButtonFalso228)
                    .addComponent(radioButtonFalso229)
                    .addComponent(radioButtonFalso231)
                    .addComponent(radioButtonFalso217))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso243)
                    .addComponent(radioButtonFalso248)
                    .addComponent(radioButtonFalso250)
                    .addComponent(radioButtonFalso234)
                    .addComponent(radioButtonCorrecto13)
                    .addComponent(radioButtonFalso239)
                    .addComponent(radioButtonFalso240)
                    .addComponent(radioButtonFalso241)
                    .addComponent(radioButtonFalso242)
                    .addComponent(radioButtonFalso251)
                    .addComponent(radioButtonFalso236)
                    .addComponent(radioButtonFalso238)
                    .addComponent(radioButtonFalso244)
                    .addComponent(radioButtonCorrecto31)
                    .addComponent(radioButtonFalso246)
                    .addComponent(radioButtonFalso247)
                    .addComponent(radioButtonFalso249)
                    .addComponent(radioButtonFalso235))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso261)
                    .addComponent(radioButtonFalso266)
                    .addComponent(radioButtonFalso268)
                    .addComponent(radioButtonCorrecto14)
                    .addComponent(radioButtonFalso255)
                    .addComponent(radioButtonFalso257)
                    .addComponent(radioButtonFalso258)
                    .addComponent(radioButtonFalso259)
                    .addComponent(radioButtonFalso260)
                    .addComponent(radioButtonFalso269)
                    .addComponent(radioButtonFalso254)
                    .addComponent(radioButtonFalso256)
                    .addComponent(radioButtonFalso262)
                    .addComponent(radioButtonFalso263)
                    .addComponent(radioButtonCorrecto32)
                    .addComponent(radioButtonFalso265)
                    .addComponent(radioButtonFalso267)
                    .addComponent(radioButtonFalso253))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso279)
                    .addComponent(radioButtonFalso284)
                    .addComponent(radioButtonCorrecto15)
                    .addComponent(radioButtonFalso270)
                    .addComponent(radioButtonFalso273)
                    .addComponent(radioButtonFalso275)
                    .addComponent(radioButtonFalso276)
                    .addComponent(radioButtonFalso277)
                    .addComponent(radioButtonFalso278)
                    .addComponent(radioButtonFalso287)
                    .addComponent(radioButtonFalso272)
                    .addComponent(radioButtonFalso274)
                    .addComponent(radioButtonFalso280)
                    .addComponent(radioButtonFalso281)
                    .addComponent(radioButtonFalso282)
                    .addComponent(radioButtonCorrecto33)
                    .addComponent(radioButtonFalso285)
                    .addComponent(radioButtonFalso271))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonCorrecto16)
                    .addComponent(radioButtonFalso302)
                    .addComponent(radioButtonFalso304)
                    .addComponent(radioButtonFalso288)
                    .addComponent(radioButtonFalso291)
                    .addComponent(radioButtonFalso293)
                    .addComponent(radioButtonFalso294)
                    .addComponent(radioButtonFalso295)
                    .addComponent(radioButtonFalso296)
                    .addComponent(radioButtonFalso305)
                    .addComponent(radioButtonFalso290)
                    .addComponent(radioButtonFalso292)
                    .addComponent(radioButtonFalso298)
                    .addComponent(radioButtonFalso299)
                    .addComponent(radioButtonFalso300)
                    .addComponent(radioButtonFalso301)
                    .addComponent(radioButtonCorrecto34)
                    .addComponent(radioButtonFalso289))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFalso315)
                    .addComponent(radioButtonCorrecto17)
                    .addComponent(radioButtonFalso322)
                    .addComponent(radioButtonFalso306)
                    .addComponent(radioButtonFalso309)
                    .addComponent(radioButtonFalso311)
                    .addComponent(radioButtonFalso312)
                    .addComponent(radioButtonFalso313)
                    .addComponent(radioButtonFalso314)
                    .addComponent(radioButtonFalso323)
                    .addComponent(radioButtonFalso308)
                    .addComponent(radioButtonFalso310)
                    .addComponent(radioButtonFalso316)
                    .addComponent(radioButtonFalso317)
                    .addComponent(radioButtonFalso318)
                    .addComponent(radioButtonFalso319)
                    .addComponent(radioButtonFalso321)
                    .addComponent(radioButtonCorrecto35))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTiempoJuego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInicioContador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonTerminarJuego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonIniciarJuego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonIngresarNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreJugadorIngresado))
                    .addComponent(panelRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreJugador)
                    .addComponent(lblNombreJugadorIngresado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIngresarNombre)
                    .addComponent(botonIniciarJuego)
                    .addComponent(lblInicioContador)
                    .addComponent(lblTiempoJuego)
                    .addComponent(botonTerminarJuego))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Cuando se da click al boton ingresar nombre se abrira un showInputDialog
     * solicitandole al usuario un nombre, gracias al manejo de excepciones si
     * un usuario no le da cancelar y mas bien cierra el showInputDialog se le
     * avisara que no podra jugar hasta que agregue un nombre.
     */
    
    private void botonIngresarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarNombreActionPerformed

        try{
        String nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre de jugador, no se permiten espacios.");
        nombreJugador = nombreJugador.replaceAll(" ", "");
        if(nombreJugador.isEmpty()){
            lblNombreJugadorIngresado.setText(lblNombreJugadorIngresado.getText());
        }
        else{
        lblNombreJugadorIngresado.setText(nombreJugador);
        lblNombreJugadorIngresado.setVisible(true);            
        }
        }catch(Exception  e){
            JOptionPane.showMessageDialog(null, "Si no se agrega un nombre, no podra jugar, ya que es necesario para las estadisticas del juego.");
        }
    }//GEN-LAST:event_botonIngresarNombreActionPerformed

    /**
     * Cuando se da click a iniciar juego se verificara que haya un nombre, si se
     * agrego un nombre se hara esperar al jugador cinco segundos para posteriormente
     * iniciar el juego.
     */
    
    private void botonIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarJuegoActionPerformed
        // TODO add your handling code here:
        if (lblNombreJugadorIngresado.getText() == "nombre"){
            JOptionPane.showMessageDialog(null, "Ingrese un nombre para jugar");
            
        }else{
        botonIngresarNombre.setVisible(false);
        
        botonIniciarJuego.setVisible(false);

        esperarJuego("El juego iniciara en 5 segundos. Para ganar se debe formar una X de 18x18 en forma diagonal.","Iniciando juego...",5000);
        panelRB.setVisible(true);
        lblInicioContador.setVisible(true);
        lblTiempoJuego.setVisible(true);
        botonTerminarJuego.setVisible(true);
        
        this.pack();
        
        iniciarConteo();
        
        }
    }//GEN-LAST:event_botonIniciarJuegoActionPerformed

    /**
     * Estos objetos se le cambiaran atributos cuando el JInternalFrame se cierre,
     * tiene un manejo de excepciones debido al timer, aveces no se inicia cuando
     * el usuario simplemente cierra y abre el JInternalFrame.
     */
    
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        try{
        lblNombreJugadorIngresado.setText("nombre");
        
        lblNombreJugadorIngresado.setVisible(false);
        
        radioButtonFalso.setSelected(false);

        radioButtonCorrecto18.setSelected(false);

        radioButtonFalso2.setSelected(false);

        radioButtonFalso3.setSelected(false);

        radioButtonFalso4.setSelected(false);

        radioButtonFalso5.setSelected(false);

        radioButtonFalso6.setSelected(false);

        radioButtonFalso7.setSelected(false);

        radioButtonFalso8.setSelected(false);

        radioButtonFalso9.setSelected(false);

        radioButtonFalso10.setSelected(false);

        radioButtonFalso11.setSelected(false);

        radioButtonFalso12.setSelected(false);

        radioButtonFalso13.setSelected(false);

        radioButtonFalso14.setSelected(false);

        radioButtonCorrecto.setSelected(false);

        radioButtonFalso16.setSelected(false);

        radioButtonFalso17.setSelected(false);

        radioButtonFalso18.setSelected(false);

        radioButtonFalso19.setSelected(false);

        radioButtonFalso20.setSelected(false);

        radioButtonFalso21.setSelected(false);

        radioButtonFalso22.setSelected(false);

        radioButtonFalso23.setSelected(false);

        radioButtonFalso24.setSelected(false);

        radioButtonFalso25.setSelected(false);

        radioButtonFalso26.setSelected(false);

        radioButtonCorrecto19.setSelected(false);

        radioButtonFalso28.setSelected(false);

        radioButtonFalso29.setSelected(false);

        radioButtonFalso30.setSelected(false);

        radioButtonFalso31.setSelected(false);

        radioButtonFalso32.setSelected(false);

        radioButtonCorrecto1.setSelected(false);

        radioButtonFalso34.setSelected(false);

        radioButtonFalso35.setSelected(false);

        radioButtonFalso36.setSelected(false);

        radioButtonFalso37.setSelected(false);

        radioButtonFalso38.setSelected(false);

        radioButtonFalso39.setSelected(false);

        radioButtonFalso40.setSelected(false);

        radioButtonFalso41.setSelected(false);

        radioButtonFalso42.setSelected(false);

        radioButtonFalso43.setSelected(false);

        radioButtonFalso44.setSelected(false);

        radioButtonFalso45.setSelected(false);

        radioButtonFalso46.setSelected(false);

        radioButtonFalso47.setSelected(false);

        radioButtonFalso48.setSelected(false);

        radioButtonCorrecto2.setSelected(false);

        radioButtonFalso50.setSelected(false);

        radioButtonFalso51.setSelected(false);

        radioButtonCorrecto20.setSelected(false);

        radioButtonFalso53.setSelected(false);

        radioButtonCorrecto21.setSelected(false);

        radioButtonFalso55.setSelected(false);

        radioButtonFalso56.setSelected(false);

        radioButtonFalso57.setSelected(false);

        radioButtonFalso58.setSelected(false);

        radioButtonFalso59.setSelected(false);

        radioButtonFalso60.setSelected(false);

        radioButtonFalso61.setSelected(false);

        radioButtonFalso62.setSelected(false);

        radioButtonFalso63.setSelected(false);

        radioButtonFalso64.setSelected(false);

        radioButtonFalso65.setSelected(false);

        radioButtonCorrecto3.setSelected(false);

        radioButtonFalso67.setSelected(false);

        radioButtonFalso68.setSelected(false);

        radioButtonFalso69.setSelected(false);

        radioButtonFalso70.setSelected(false);

        radioButtonFalso71.setSelected(false);

        radioButtonFalso72.setSelected(false);

        radioButtonFalso73.setSelected(false);

        radioButtonFalso74.setSelected(false);

        radioButtonCorrecto22.setSelected(false);

        radioButtonFalso76.setSelected(false);

        radioButtonFalso77.setSelected(false);

        radioButtonFalso78.setSelected(false);

        radioButtonFalso79.setSelected(false);

        radioButtonFalso80.setSelected(false);

        radioButtonFalso81.setSelected(false);

        radioButtonFalso82.setSelected(false);

        radioButtonCorrecto4.setSelected(false);

        radioButtonFalso84.setSelected(false);

        radioButtonFalso85.setSelected(false);

        radioButtonFalso86.setSelected(false);

        radioButtonFalso87.setSelected(false);

        radioButtonFalso88.setSelected(false);

        radioButtonFalso89.setSelected(false);

        radioButtonFalso90.setSelected(false);

        radioButtonFalso91.setSelected(false);

        radioButtonFalso92.setSelected(false);

        radioButtonFalso93.setSelected(false);

        radioButtonFalso94.setSelected(false);

        radioButtonCorrecto23.setSelected(false);

        radioButtonFalso96.setSelected(false);

        radioButtonFalso97.setSelected(false);

        radioButtonFalso98.setSelected(false);

        radioButtonFalso99.setSelected(false);

        radioButtonCorrecto5.setSelected(false);

        radioButtonFalso101.setSelected(false);

        radioButtonFalso102.setSelected(false);

        radioButtonFalso103.setSelected(false);

        radioButtonFalso104.setSelected(false);

        radioButtonFalso105.setSelected(false);

        radioButtonFalso106.setSelected(false);

        radioButtonFalso107.setSelected(false);

        radioButtonFalso108.setSelected(false);

        radioButtonFalso109.setSelected(false);

        radioButtonFalso110.setSelected(false);

        radioButtonFalso111.setSelected(false);

        radioButtonCorrecto6.setSelected(false);

        radioButtonFalso113.setSelected(false);

        radioButtonCorrecto24.setSelected(false);

        radioButtonFalso115.setSelected(false);

        radioButtonFalso116.setSelected(false);

        radioButtonFalso117.setSelected(false);

        radioButtonFalso118.setSelected(false);

        radioButtonFalso119.setSelected(false);

        radioButtonFalso120.setSelected(false);

        radioButtonFalso121.setSelected(false);

        radioButtonFalso122.setSelected(false);

        radioButtonFalso123.setSelected(false);

        radioButtonFalso124.setSelected(false);

        radioButtonFalso125.setSelected(false);

        radioButtonFalso126.setSelected(false);

        radioButtonFalso127.setSelected(false);

        radioButtonFalso128.setSelected(false);

        radioButtonFalso129.setSelected(false);

        radioButtonFalso130.setSelected(false);

        radioButtonFalso131.setSelected(false);

        radioButtonFalso132.setSelected(false);

        radioButtonCorrecto25.setSelected(false);

        radioButtonFalso134.setSelected(false);

        radioButtonFalso135.setSelected(false);

        radioButtonFalso136.setSelected(false);

        radioButtonFalso137.setSelected(false);

        radioButtonFalso138.setSelected(false);

        radioButtonFalso139.setSelected(false);

        radioButtonFalso140.setSelected(false);

        radioButtonFalso141.setSelected(false);

        radioButtonFalso142.setSelected(false);

        radioButtonCorrecto7.setSelected(false);

        radioButtonFalso144.setSelected(false);

        radioButtonFalso145.setSelected(false);

        radioButtonCorrecto8.setSelected(false);

        radioButtonFalso147.setSelected(false);

        radioButtonFalso148.setSelected(false);

        radioButtonFalso149.setSelected(false);

        radioButtonFalso150.setSelected(false);

        radioButtonFalso151.setSelected(false);

        radioButtonCorrecto26.setSelected(false);

        radioButtonFalso153.setSelected(false);

        radioButtonFalso154.setSelected(false);

        radioButtonFalso155.setSelected(false);

        radioButtonFalso156.setSelected(false);

        radioButtonFalso157.setSelected(false);

        radioButtonFalso158.setSelected(false);

        radioButtonFalso159.setSelected(false);

        radioButtonFalso160.setSelected(false);

        radioButtonFalso161.setSelected(false);

        radioButtonFalso162.setSelected(false);

        radioButtonFalso163.setSelected(false);

        radioButtonCorrecto27.setSelected(false);

        radioButtonFalso165.setSelected(false);

        radioButtonFalso166.setSelected(false);

        radioButtonFalso167.setSelected(false);

        radioButtonFalso168.setSelected(false);

        radioButtonFalso169.setSelected(false);

        radioButtonCorrecto9.setSelected(false);

        radioButtonFalso171.setSelected(false);

        radioButtonFalso172.setSelected(false);

        radioButtonFalso173.setSelected(false);

        radioButtonFalso174.setSelected(false);

        radioButtonFalso175.setSelected(false);

        radioButtonFalso176.setSelected(false);

        radioButtonFalso177.setSelected(false);

        radioButtonFalso178.setSelected(false);

        radioButtonFalso179.setSelected(false);

        radioButtonFalso180.setSelected(false);

        radioButtonFalso181.setSelected(false);

        radioButtonFalso182.setSelected(false);

        radioButtonFalso183.setSelected(false);

        radioButtonFalso184.setSelected(false);

        radioButtonFalso185.setSelected(false);

        radioButtonFalso186.setSelected(false);

        radioButtonCorrecto10.setSelected(false);

        radioButtonFalso188.setSelected(false);

        radioButtonFalso189.setSelected(false);

        radioButtonFalso190.setSelected(false);

        radioButtonFalso191.setSelected(false);

        radioButtonFalso192.setSelected(false);

        radioButtonFalso193.setSelected(false);

        radioButtonFalso194.setSelected(false);

        radioButtonFalso195.setSelected(false);

        radioButtonFalso196.setSelected(false);

        radioButtonCorrecto28.setSelected(false);

        radioButtonFalso198.setSelected(false);

        radioButtonFalso199.setSelected(false);

        radioButtonFalso200.setSelected(false);

        radioButtonFalso201.setSelected(false);

        radioButtonCorrecto29.setSelected(false);

        radioButtonFalso203.setSelected(false);

        radioButtonCorrecto11.setSelected(false);

        radioButtonFalso205.setSelected(false);

        radioButtonFalso206.setSelected(false);

        radioButtonFalso207.setSelected(false);

        radioButtonFalso208.setSelected(false);

        radioButtonFalso209.setSelected(false);

        radioButtonFalso210.setSelected(false);

        radioButtonFalso211.setSelected(false);

        radioButtonFalso212.setSelected(false);

        radioButtonFalso213.setSelected(false);

        radioButtonFalso214.setSelected(false);

        radioButtonFalso215.setSelected(false);

        radioButtonFalso216.setSelected(false);

        radioButtonFalso217.setSelected(false);

        radioButtonFalso218.setSelected(false);

        radioButtonFalso219.setSelected(false);

        radioButtonFalso220.setSelected(false);

        radioButtonCorrecto12.setSelected(false);

        radioButtonFalso222.setSelected(false);

        radioButtonFalso223.setSelected(false);

        radioButtonFalso224.setSelected(false);

        radioButtonFalso225.setSelected(false);

        radioButtonCorrecto30.setSelected(false);

        radioButtonFalso227.setSelected(false);

        radioButtonFalso228.setSelected(false);

        radioButtonFalso229.setSelected(false);

        radioButtonFalso230.setSelected(false);

        radioButtonFalso231.setSelected(false);

        radioButtonFalso232.setSelected(false);

        radioButtonFalso233.setSelected(false);

        radioButtonFalso234.setSelected(false);

        radioButtonFalso235.setSelected(false);

        radioButtonFalso236.setSelected(false);

        radioButtonCorrecto13.setSelected(false);

        radioButtonFalso238.setSelected(false);

        radioButtonFalso239.setSelected(false);

        radioButtonFalso240.setSelected(false);

        radioButtonFalso241.setSelected(false);

        radioButtonFalso242.setSelected(false);

        radioButtonFalso243.setSelected(false);

        radioButtonFalso244.setSelected(false);

        radioButtonCorrecto31.setSelected(false);

        radioButtonFalso246.setSelected(false);

        radioButtonFalso247.setSelected(false);

        radioButtonFalso248.setSelected(false);

        radioButtonFalso249.setSelected(false);

        radioButtonFalso250.setSelected(false);

        radioButtonFalso251.setSelected(false);

        radioButtonCorrecto14.setSelected(false);

        radioButtonFalso253.setSelected(false);

        radioButtonFalso254.setSelected(false);

        radioButtonFalso255.setSelected(false);

        radioButtonFalso256.setSelected(false);

        radioButtonFalso257.setSelected(false);

        radioButtonFalso258.setSelected(false);

        radioButtonFalso259.setSelected(false);

        radioButtonFalso260.setSelected(false);

        radioButtonFalso261.setSelected(false);

        radioButtonFalso262.setSelected(false);

        radioButtonFalso263.setSelected(false);

        radioButtonCorrecto32.setSelected(false);

        radioButtonFalso265.setSelected(false);

        radioButtonFalso266.setSelected(false);

        radioButtonFalso267.setSelected(false);

        radioButtonFalso268.setSelected(false);

        radioButtonFalso269.setSelected(false);

        radioButtonFalso270.setSelected(false);

        radioButtonFalso271.setSelected(false);

        radioButtonFalso272.setSelected(false);

        radioButtonFalso273.setSelected(false);

        radioButtonFalso274.setSelected(false);

        radioButtonFalso275.setSelected(false);

        radioButtonFalso276.setSelected(false);

        radioButtonFalso277.setSelected(false);

        radioButtonFalso278.setSelected(false);

        radioButtonFalso279.setSelected(false);

        radioButtonFalso280.setSelected(false);

        radioButtonFalso281.setSelected(false);

        radioButtonFalso282.setSelected(false);

        radioButtonCorrecto33.setSelected(false);

        radioButtonFalso284.setSelected(false);

        radioButtonFalso285.setSelected(false);

        radioButtonCorrecto15.setSelected(false);

        radioButtonFalso287.setSelected(false);

        radioButtonFalso288.setSelected(false);

        radioButtonFalso289.setSelected(false);

        radioButtonFalso290.setSelected(false);

        radioButtonFalso291.setSelected(false);

        radioButtonFalso292.setSelected(false);

        radioButtonFalso293.setSelected(false);

        radioButtonFalso294.setSelected(false);

        radioButtonFalso295.setSelected(false);

        radioButtonFalso296.setSelected(false);

        radioButtonCorrecto16.setSelected(false);

        radioButtonFalso298.setSelected(false);

        radioButtonFalso299.setSelected(false);

        radioButtonFalso300.setSelected(false);

        radioButtonFalso301.setSelected(false);

        radioButtonFalso302.setSelected(false);

        radioButtonCorrecto34.setSelected(false);

        radioButtonFalso304.setSelected(false);

        radioButtonFalso305.setSelected(false);

        radioButtonFalso306.setSelected(false);

        radioButtonCorrecto35.setSelected(false);

        radioButtonFalso308.setSelected(false);

        radioButtonFalso309.setSelected(false);

        radioButtonFalso310.setSelected(false);

        radioButtonFalso311.setSelected(false);

        radioButtonFalso312.setSelected(false);

        radioButtonFalso313.setSelected(false);

        radioButtonFalso314.setSelected(false);

        radioButtonFalso315.setSelected(false);

        radioButtonFalso316.setSelected(false);

        radioButtonFalso317.setSelected(false);

        radioButtonFalso318.setSelected(false);

        radioButtonFalso319.setSelected(false);

        radioButtonCorrecto17.setSelected(false);

        radioButtonFalso321.setSelected(false);

        radioButtonFalso322.setSelected(false);

        radioButtonFalso323.setSelected(false);
        
        botonIngresarNombre.setVisible(true);
        
        botonIniciarJuego.setVisible(true);
        
        tiempoJuego.stop();
        
        lblInicioContador.setText("0");
        
        tiempoTranscurrido=1;
        
        panelRB.setVisible(false);
        
        lblInicioContador.setVisible(false);
        lblTiempoJuego.setVisible(false);
        botonTerminarJuego.setVisible(false);
        lblInicioContador.setText("0");
        this.pack();
        }catch(Exception e){
        }
        
        

    }//GEN-LAST:event_formInternalFrameClosed

    /**
     * Cuando se presione el boton terminar se verificara que se haya creado las condiciones
     * para terminar el juego, si el usuario no lo logro se le avisara, en caso que si
     * lo haya logrado se obtendran los Stats del juego y se agregara al archivo de texto
     * para luego ser ordenado.
     */
    
    private void botonTerminarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarJuegoActionPerformed
        // TODO add your handling code here:
        if(radioButtonCorrecto.isSelected()&& radioButtonCorrecto1.isSelected()
                && radioButtonCorrecto2.isSelected()&& radioButtonCorrecto3.isSelected()
                && radioButtonCorrecto4.isSelected()&& radioButtonCorrecto5.isSelected()
                && radioButtonCorrecto6.isSelected()&& radioButtonCorrecto7.isSelected()
                && radioButtonCorrecto8.isSelected()&& radioButtonCorrecto9.isSelected()
                && radioButtonCorrecto10.isSelected()&& radioButtonCorrecto11.isSelected()
                && radioButtonCorrecto12.isSelected()&& radioButtonCorrecto13.isSelected()
                && radioButtonCorrecto14.isSelected()&& radioButtonCorrecto15.isSelected()
                && radioButtonCorrecto16.isSelected()&& radioButtonCorrecto17.isSelected()
                && radioButtonCorrecto18.isSelected()&& radioButtonCorrecto19.isSelected()
                && radioButtonCorrecto20.isSelected()&& radioButtonCorrecto21.isSelected()
                && radioButtonCorrecto22.isSelected()&& radioButtonCorrecto23.isSelected()
                && radioButtonCorrecto24.isSelected()&& radioButtonCorrecto25.isSelected()
                && radioButtonCorrecto26.isSelected()&& radioButtonCorrecto27.isSelected()
                && radioButtonCorrecto28.isSelected()&& radioButtonCorrecto29.isSelected()
                && radioButtonCorrecto30.isSelected()&& radioButtonCorrecto31.isSelected()
                && radioButtonCorrecto32.isSelected()&& radioButtonCorrecto33.isSelected()
                && radioButtonCorrecto34.isSelected()&& radioButtonCorrecto35.isSelected()
                && !radioButtonFalso.isSelected()
                && !radioButtonFalso10.isSelected()
                && !radioButtonFalso101.isSelected()
                && !radioButtonFalso102.isSelected()
                && !radioButtonFalso103.isSelected()
                && !radioButtonFalso104.isSelected()
                && !radioButtonFalso105.isSelected()
                && !radioButtonFalso106.isSelected()
                && !radioButtonFalso107.isSelected()
                && !radioButtonFalso108.isSelected()
                && !radioButtonFalso109.isSelected()
                && !radioButtonFalso11.isSelected()
                && !radioButtonFalso110.isSelected()
                && !radioButtonFalso111.isSelected()
                && !radioButtonFalso113.isSelected()
                && !radioButtonFalso115.isSelected()
                && !radioButtonFalso116.isSelected()
                && !radioButtonFalso117.isSelected()
                && !radioButtonFalso118.isSelected()
                && !radioButtonFalso119.isSelected()
                && !radioButtonFalso12.isSelected()
                && !radioButtonFalso120.isSelected()
                && !radioButtonFalso121.isSelected()
                && !radioButtonFalso122.isSelected()
                && !radioButtonFalso123.isSelected()
                && !radioButtonFalso124.isSelected()
                && !radioButtonFalso125.isSelected()
                && !radioButtonFalso126.isSelected()
                && !radioButtonFalso127.isSelected()
                && !radioButtonFalso128.isSelected()
                && !radioButtonFalso129.isSelected()
                && !radioButtonFalso13.isSelected()
                && !radioButtonFalso130.isSelected()
                && !radioButtonFalso131.isSelected()
                && !radioButtonFalso132.isSelected()
                && !radioButtonFalso134.isSelected()
                && !radioButtonFalso135.isSelected()
                && !radioButtonFalso136.isSelected()
                && !radioButtonFalso137.isSelected()
                && !radioButtonFalso138.isSelected()
                && !radioButtonFalso139.isSelected()
                && !radioButtonFalso14.isSelected()
                && !radioButtonFalso140.isSelected()
                && !radioButtonFalso141.isSelected()
                && !radioButtonFalso142.isSelected()
                && !radioButtonFalso144.isSelected()
                && !radioButtonFalso145.isSelected()
                && !radioButtonFalso147.isSelected()
                && !radioButtonFalso148.isSelected()
                && !radioButtonFalso149.isSelected()
                && !radioButtonFalso150.isSelected()
                && !radioButtonFalso151.isSelected()
                && !radioButtonFalso153.isSelected()
                && !radioButtonFalso154.isSelected()
                && !radioButtonFalso155.isSelected()
                && !radioButtonFalso156.isSelected()
                && !radioButtonFalso157.isSelected()
                && !radioButtonFalso158.isSelected()
                && !radioButtonFalso159.isSelected()
                && !radioButtonFalso16.isSelected()
                && !radioButtonFalso160.isSelected()
                && !radioButtonFalso161.isSelected()
                && !radioButtonFalso162.isSelected()
                && !radioButtonFalso163.isSelected()
                && !radioButtonFalso165.isSelected()
                && !radioButtonFalso166.isSelected()
                && !radioButtonFalso167.isSelected()
                && !radioButtonFalso168.isSelected()
                && !radioButtonFalso169.isSelected()
                && !radioButtonFalso17.isSelected()
                && !radioButtonFalso171.isSelected()
                && !radioButtonFalso172.isSelected()
                && !radioButtonFalso173.isSelected()
                && !radioButtonFalso174.isSelected()
                && !radioButtonFalso175.isSelected()
                && !radioButtonFalso176.isSelected()
                && !radioButtonFalso177.isSelected()
                && !radioButtonFalso178.isSelected()
                && !radioButtonFalso179.isSelected()
                && !radioButtonFalso18.isSelected()
                && !radioButtonFalso180.isSelected()
                && !radioButtonFalso181.isSelected()
                && !radioButtonFalso182.isSelected()
                && !radioButtonFalso183.isSelected()
                && !radioButtonFalso184.isSelected()
                && !radioButtonFalso185.isSelected()
                && !radioButtonFalso186.isSelected()
                && !radioButtonFalso188.isSelected()
                && !radioButtonFalso189.isSelected()
                && !radioButtonFalso19.isSelected()
                && !radioButtonFalso190.isSelected()
                && !radioButtonFalso191.isSelected()
                && !radioButtonFalso192.isSelected()
                && !radioButtonFalso193.isSelected()
                && !radioButtonFalso194.isSelected()
                && !radioButtonFalso195.isSelected()
                && !radioButtonFalso196.isSelected()
                && !radioButtonFalso198.isSelected()
                && !radioButtonFalso199.isSelected()
                && !radioButtonFalso2.isSelected()
                && !radioButtonFalso20.isSelected()
                && !radioButtonFalso200.isSelected()
                && !radioButtonFalso201.isSelected()
                && !radioButtonFalso203.isSelected()
                && !radioButtonFalso205.isSelected()
                && !radioButtonFalso206.isSelected()
                && !radioButtonFalso207.isSelected()
                && !radioButtonFalso208.isSelected()
                && !radioButtonFalso209.isSelected()
                && !radioButtonFalso21.isSelected()
                && !radioButtonFalso210.isSelected()
                && !radioButtonFalso211.isSelected()
                && !radioButtonFalso212.isSelected()
                && !radioButtonFalso213.isSelected()
                && !radioButtonFalso214.isSelected()
                && !radioButtonFalso215.isSelected()
                && !radioButtonFalso216.isSelected()
                && !radioButtonFalso217.isSelected()
                && !radioButtonFalso218.isSelected()
                && !radioButtonFalso219.isSelected()
                && !radioButtonFalso22.isSelected()
                && !radioButtonFalso220.isSelected()
                && !radioButtonFalso222.isSelected()
                && !radioButtonFalso223.isSelected()
                && !radioButtonFalso224.isSelected()
                && !radioButtonFalso225.isSelected()
                && !radioButtonFalso227.isSelected()
                && !radioButtonFalso228.isSelected()
                && !radioButtonFalso229.isSelected()
                && !radioButtonFalso23.isSelected()
                && !radioButtonFalso230.isSelected()
                && !radioButtonFalso231.isSelected()
                && !radioButtonFalso232.isSelected()
                && !radioButtonFalso233.isSelected()
                && !radioButtonFalso234.isSelected()
                && !radioButtonFalso235.isSelected()
                && !radioButtonFalso236.isSelected()
                && !radioButtonFalso238.isSelected()
                && !radioButtonFalso239.isSelected()
                && !radioButtonFalso24.isSelected()
                && !radioButtonFalso240.isSelected()
                && !radioButtonFalso241.isSelected()
                && !radioButtonFalso242.isSelected()
                && !radioButtonFalso243.isSelected()
                && !radioButtonFalso244.isSelected()
                && !radioButtonFalso246.isSelected()
                && !radioButtonFalso247.isSelected()
                && !radioButtonFalso248.isSelected()
                && !radioButtonFalso249.isSelected()
                && !radioButtonFalso25.isSelected()
                && !radioButtonFalso250.isSelected()
                && !radioButtonFalso251.isSelected()
                && !radioButtonFalso253.isSelected()
                && !radioButtonFalso254.isSelected()
                && !radioButtonFalso255.isSelected()
                && !radioButtonFalso256.isSelected()
                && !radioButtonFalso257.isSelected()
                && !radioButtonFalso258.isSelected()
                && !radioButtonFalso259.isSelected()
                && !radioButtonFalso26.isSelected()
                && !radioButtonFalso260.isSelected()
                && !radioButtonFalso261.isSelected()
                && !radioButtonFalso262.isSelected()
                && !radioButtonFalso263.isSelected()
                && !radioButtonFalso265.isSelected()
                && !radioButtonFalso266.isSelected()
                && !radioButtonFalso267.isSelected()
                && !radioButtonFalso268.isSelected()
                && !radioButtonFalso269.isSelected()
                && !radioButtonFalso270.isSelected()
                && !radioButtonFalso271.isSelected()
                && !radioButtonFalso272.isSelected()
                && !radioButtonFalso273.isSelected()
                && !radioButtonFalso274.isSelected()
                && !radioButtonFalso275.isSelected()
                && !radioButtonFalso276.isSelected()
                && !radioButtonFalso277.isSelected()
                && !radioButtonFalso278.isSelected()
                && !radioButtonFalso279.isSelected()
                && !radioButtonFalso28.isSelected()
                && !radioButtonFalso280.isSelected()
                && !radioButtonFalso281.isSelected()
                && !radioButtonFalso282.isSelected()
                && !radioButtonFalso284.isSelected()
                && !radioButtonFalso285.isSelected()
                && !radioButtonFalso287.isSelected()
                && !radioButtonFalso288.isSelected()
                && !radioButtonFalso289.isSelected()
                && !radioButtonFalso29.isSelected()
                && !radioButtonFalso290.isSelected()
                && !radioButtonFalso291.isSelected()
                && !radioButtonFalso292.isSelected()
                && !radioButtonFalso293.isSelected()
                && !radioButtonFalso294.isSelected()
                && !radioButtonFalso295.isSelected()
                && !radioButtonFalso296.isSelected()
                && !radioButtonFalso298.isSelected()
                && !radioButtonFalso299.isSelected()
                && !radioButtonFalso3.isSelected()
                && !radioButtonFalso30.isSelected()
                && !radioButtonFalso300.isSelected()
                && !radioButtonFalso301.isSelected()
                && !radioButtonFalso302.isSelected()
                && !radioButtonFalso304.isSelected()
                && !radioButtonFalso305.isSelected()
                && !radioButtonFalso306.isSelected()
                && !radioButtonFalso308.isSelected()
                && !radioButtonFalso309.isSelected()
                && !radioButtonFalso31.isSelected()
                && !radioButtonFalso310.isSelected()
                && !radioButtonFalso311.isSelected()
                && !radioButtonFalso312.isSelected()
                && !radioButtonFalso313.isSelected()
                && !radioButtonFalso314.isSelected()
                && !radioButtonFalso315.isSelected()
                && !radioButtonFalso316.isSelected()
                && !radioButtonFalso317.isSelected()
                && !radioButtonFalso318.isSelected()
                && !radioButtonFalso319.isSelected()
                && !radioButtonFalso32.isSelected()
                && !radioButtonFalso321.isSelected()
                && !radioButtonFalso322.isSelected()
                && !radioButtonFalso323.isSelected()
                && !radioButtonFalso34.isSelected()
                && !radioButtonFalso35.isSelected()
                && !radioButtonFalso36.isSelected()
                && !radioButtonFalso37.isSelected()
                && !radioButtonFalso38.isSelected()
                && !radioButtonFalso39.isSelected()
                && !radioButtonFalso4.isSelected()
                && !radioButtonFalso40.isSelected()
                && !radioButtonFalso41.isSelected()
                && !radioButtonFalso42.isSelected()
                && !radioButtonFalso43.isSelected()
                && !radioButtonFalso44.isSelected()
                && !radioButtonFalso45.isSelected()
                && !radioButtonFalso46.isSelected()
                && !radioButtonFalso47.isSelected()
                && !radioButtonFalso48.isSelected()
                && !radioButtonFalso5.isSelected()
                && !radioButtonFalso50.isSelected()
                && !radioButtonFalso51.isSelected()
                && !radioButtonFalso53.isSelected()
                && !radioButtonFalso55.isSelected()
                && !radioButtonFalso56.isSelected()
                && !radioButtonFalso57.isSelected()
                && !radioButtonFalso58.isSelected()
                && !radioButtonFalso59.isSelected()
                && !radioButtonFalso6.isSelected()
                && !radioButtonFalso60.isSelected()
                && !radioButtonFalso61.isSelected()
                && !radioButtonFalso62.isSelected()
                && !radioButtonFalso63.isSelected()
                && !radioButtonFalso64.isSelected()
                && !radioButtonFalso65.isSelected()
                && !radioButtonFalso67.isSelected()
                && !radioButtonFalso68.isSelected()
                && !radioButtonFalso69.isSelected()
                && !radioButtonFalso7.isSelected()
                && !radioButtonFalso70.isSelected()
                && !radioButtonFalso71.isSelected()
                && !radioButtonFalso72.isSelected()
                && !radioButtonFalso73.isSelected()
                && !radioButtonFalso74.isSelected()
                && !radioButtonFalso76.isSelected()
                && !radioButtonFalso77.isSelected()
                && !radioButtonFalso78.isSelected()
                && !radioButtonFalso79.isSelected()
                && !radioButtonFalso8.isSelected()
                && !radioButtonFalso80.isSelected()
                && !radioButtonFalso81.isSelected()
                && !radioButtonFalso82.isSelected()
                && !radioButtonFalso84.isSelected()
                && !radioButtonFalso85.isSelected()
                && !radioButtonFalso86.isSelected()
                && !radioButtonFalso87.isSelected()
                && !radioButtonFalso88.isSelected()
                && !radioButtonFalso89.isSelected()
                && !radioButtonFalso9.isSelected()
                && !radioButtonFalso90.isSelected()
                && !radioButtonFalso91.isSelected()
                && !radioButtonFalso92.isSelected()
                && !radioButtonFalso93.isSelected()
                && !radioButtonFalso94.isSelected()
                && !radioButtonFalso96.isSelected()
                && !radioButtonFalso97.isSelected()
                && !radioButtonFalso98.isSelected()
                && !radioButtonFalso99.isSelected())
        {
            tiempoJuego.stop();
            
            Stat s = getStats();
            s.writeArchive();
            //getStats();
            JOptionPane.showMessageDialog(null, "Excelente " +lblNombreJugadorIngresado.getText()+" terminaste el juego en: "+lblInicioContador.getText()+" segundos.");
            this.dispose();
        }else{
            esperarJuego("No se ha hecho correctamente la X en 18x18 en forma diagonal.","Vuelve a intentarlo",1000);
        }
    }//GEN-LAST:event_botonTerminarJuegoActionPerformed

    /**
     * Estos objetos se le cambiaran atributos cuando el JInternalFrame se abra.
     */
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        panelRB.setVisible(false);
        
        lblNombreJugadorIngresado.setVisible(false);
        lblInicioContador.setVisible(false);
        lblTiempoJuego.setVisible(false);
        botonTerminarJuego.setVisible(false);
        lblInicioContador.setText("0");
        this.pack();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresarNombre;
    private javax.swing.JButton botonIniciarJuego;
    private javax.swing.JButton botonTerminarJuego;
    private javax.swing.JLabel lblInicioContador;
    public static javax.swing.JLabel lblNombreJugador;
    private javax.swing.JLabel lblNombreJugadorIngresado;
    private javax.swing.JLabel lblTiempoJuego;
    private javax.swing.JPanel panelRB;
    private javax.swing.JRadioButton radioButtonCorrecto;
    private javax.swing.JRadioButton radioButtonCorrecto1;
    private javax.swing.JRadioButton radioButtonCorrecto10;
    private javax.swing.JRadioButton radioButtonCorrecto11;
    private javax.swing.JRadioButton radioButtonCorrecto12;
    private javax.swing.JRadioButton radioButtonCorrecto13;
    private javax.swing.JRadioButton radioButtonCorrecto14;
    private javax.swing.JRadioButton radioButtonCorrecto15;
    private javax.swing.JRadioButton radioButtonCorrecto16;
    private javax.swing.JRadioButton radioButtonCorrecto17;
    private javax.swing.JRadioButton radioButtonCorrecto18;
    private javax.swing.JRadioButton radioButtonCorrecto19;
    private javax.swing.JRadioButton radioButtonCorrecto2;
    private javax.swing.JRadioButton radioButtonCorrecto20;
    private javax.swing.JRadioButton radioButtonCorrecto21;
    private javax.swing.JRadioButton radioButtonCorrecto22;
    private javax.swing.JRadioButton radioButtonCorrecto23;
    private javax.swing.JRadioButton radioButtonCorrecto24;
    private javax.swing.JRadioButton radioButtonCorrecto25;
    private javax.swing.JRadioButton radioButtonCorrecto26;
    private javax.swing.JRadioButton radioButtonCorrecto27;
    private javax.swing.JRadioButton radioButtonCorrecto28;
    private javax.swing.JRadioButton radioButtonCorrecto29;
    private javax.swing.JRadioButton radioButtonCorrecto3;
    private javax.swing.JRadioButton radioButtonCorrecto30;
    private javax.swing.JRadioButton radioButtonCorrecto31;
    private javax.swing.JRadioButton radioButtonCorrecto32;
    private javax.swing.JRadioButton radioButtonCorrecto33;
    private javax.swing.JRadioButton radioButtonCorrecto34;
    private javax.swing.JRadioButton radioButtonCorrecto35;
    private javax.swing.JRadioButton radioButtonCorrecto4;
    private javax.swing.JRadioButton radioButtonCorrecto5;
    private javax.swing.JRadioButton radioButtonCorrecto6;
    private javax.swing.JRadioButton radioButtonCorrecto7;
    private javax.swing.JRadioButton radioButtonCorrecto8;
    private javax.swing.JRadioButton radioButtonCorrecto9;
    private javax.swing.JRadioButton radioButtonFalso;
    private javax.swing.JRadioButton radioButtonFalso10;
    private javax.swing.JRadioButton radioButtonFalso101;
    private javax.swing.JRadioButton radioButtonFalso102;
    private javax.swing.JRadioButton radioButtonFalso103;
    private javax.swing.JRadioButton radioButtonFalso104;
    private javax.swing.JRadioButton radioButtonFalso105;
    private javax.swing.JRadioButton radioButtonFalso106;
    private javax.swing.JRadioButton radioButtonFalso107;
    private javax.swing.JRadioButton radioButtonFalso108;
    private javax.swing.JRadioButton radioButtonFalso109;
    private javax.swing.JRadioButton radioButtonFalso11;
    private javax.swing.JRadioButton radioButtonFalso110;
    private javax.swing.JRadioButton radioButtonFalso111;
    private javax.swing.JRadioButton radioButtonFalso113;
    private javax.swing.JRadioButton radioButtonFalso115;
    private javax.swing.JRadioButton radioButtonFalso116;
    private javax.swing.JRadioButton radioButtonFalso117;
    private javax.swing.JRadioButton radioButtonFalso118;
    private javax.swing.JRadioButton radioButtonFalso119;
    private javax.swing.JRadioButton radioButtonFalso12;
    private javax.swing.JRadioButton radioButtonFalso120;
    private javax.swing.JRadioButton radioButtonFalso121;
    private javax.swing.JRadioButton radioButtonFalso122;
    private javax.swing.JRadioButton radioButtonFalso123;
    private javax.swing.JRadioButton radioButtonFalso124;
    private javax.swing.JRadioButton radioButtonFalso125;
    private javax.swing.JRadioButton radioButtonFalso126;
    private javax.swing.JRadioButton radioButtonFalso127;
    private javax.swing.JRadioButton radioButtonFalso128;
    private javax.swing.JRadioButton radioButtonFalso129;
    private javax.swing.JRadioButton radioButtonFalso13;
    private javax.swing.JRadioButton radioButtonFalso130;
    private javax.swing.JRadioButton radioButtonFalso131;
    private javax.swing.JRadioButton radioButtonFalso132;
    private javax.swing.JRadioButton radioButtonFalso134;
    private javax.swing.JRadioButton radioButtonFalso135;
    private javax.swing.JRadioButton radioButtonFalso136;
    private javax.swing.JRadioButton radioButtonFalso137;
    private javax.swing.JRadioButton radioButtonFalso138;
    private javax.swing.JRadioButton radioButtonFalso139;
    private javax.swing.JRadioButton radioButtonFalso14;
    private javax.swing.JRadioButton radioButtonFalso140;
    private javax.swing.JRadioButton radioButtonFalso141;
    private javax.swing.JRadioButton radioButtonFalso142;
    private javax.swing.JRadioButton radioButtonFalso144;
    private javax.swing.JRadioButton radioButtonFalso145;
    private javax.swing.JRadioButton radioButtonFalso147;
    private javax.swing.JRadioButton radioButtonFalso148;
    private javax.swing.JRadioButton radioButtonFalso149;
    private javax.swing.JRadioButton radioButtonFalso150;
    private javax.swing.JRadioButton radioButtonFalso151;
    private javax.swing.JRadioButton radioButtonFalso153;
    private javax.swing.JRadioButton radioButtonFalso154;
    private javax.swing.JRadioButton radioButtonFalso155;
    private javax.swing.JRadioButton radioButtonFalso156;
    private javax.swing.JRadioButton radioButtonFalso157;
    private javax.swing.JRadioButton radioButtonFalso158;
    private javax.swing.JRadioButton radioButtonFalso159;
    private javax.swing.JRadioButton radioButtonFalso16;
    private javax.swing.JRadioButton radioButtonFalso160;
    private javax.swing.JRadioButton radioButtonFalso161;
    private javax.swing.JRadioButton radioButtonFalso162;
    private javax.swing.JRadioButton radioButtonFalso163;
    private javax.swing.JRadioButton radioButtonFalso165;
    private javax.swing.JRadioButton radioButtonFalso166;
    private javax.swing.JRadioButton radioButtonFalso167;
    private javax.swing.JRadioButton radioButtonFalso168;
    private javax.swing.JRadioButton radioButtonFalso169;
    private javax.swing.JRadioButton radioButtonFalso17;
    private javax.swing.JRadioButton radioButtonFalso171;
    private javax.swing.JRadioButton radioButtonFalso172;
    private javax.swing.JRadioButton radioButtonFalso173;
    private javax.swing.JRadioButton radioButtonFalso174;
    private javax.swing.JRadioButton radioButtonFalso175;
    private javax.swing.JRadioButton radioButtonFalso176;
    private javax.swing.JRadioButton radioButtonFalso177;
    private javax.swing.JRadioButton radioButtonFalso178;
    private javax.swing.JRadioButton radioButtonFalso179;
    private javax.swing.JRadioButton radioButtonFalso18;
    private javax.swing.JRadioButton radioButtonFalso180;
    private javax.swing.JRadioButton radioButtonFalso181;
    private javax.swing.JRadioButton radioButtonFalso182;
    private javax.swing.JRadioButton radioButtonFalso183;
    private javax.swing.JRadioButton radioButtonFalso184;
    private javax.swing.JRadioButton radioButtonFalso185;
    private javax.swing.JRadioButton radioButtonFalso186;
    private javax.swing.JRadioButton radioButtonFalso188;
    private javax.swing.JRadioButton radioButtonFalso189;
    private javax.swing.JRadioButton radioButtonFalso19;
    private javax.swing.JRadioButton radioButtonFalso190;
    private javax.swing.JRadioButton radioButtonFalso191;
    private javax.swing.JRadioButton radioButtonFalso192;
    private javax.swing.JRadioButton radioButtonFalso193;
    private javax.swing.JRadioButton radioButtonFalso194;
    private javax.swing.JRadioButton radioButtonFalso195;
    private javax.swing.JRadioButton radioButtonFalso196;
    private javax.swing.JRadioButton radioButtonFalso198;
    private javax.swing.JRadioButton radioButtonFalso199;
    private javax.swing.JRadioButton radioButtonFalso2;
    private javax.swing.JRadioButton radioButtonFalso20;
    private javax.swing.JRadioButton radioButtonFalso200;
    private javax.swing.JRadioButton radioButtonFalso201;
    private javax.swing.JRadioButton radioButtonFalso203;
    private javax.swing.JRadioButton radioButtonFalso205;
    private javax.swing.JRadioButton radioButtonFalso206;
    private javax.swing.JRadioButton radioButtonFalso207;
    private javax.swing.JRadioButton radioButtonFalso208;
    private javax.swing.JRadioButton radioButtonFalso209;
    private javax.swing.JRadioButton radioButtonFalso21;
    private javax.swing.JRadioButton radioButtonFalso210;
    private javax.swing.JRadioButton radioButtonFalso211;
    private javax.swing.JRadioButton radioButtonFalso212;
    private javax.swing.JRadioButton radioButtonFalso213;
    private javax.swing.JRadioButton radioButtonFalso214;
    private javax.swing.JRadioButton radioButtonFalso215;
    private javax.swing.JRadioButton radioButtonFalso216;
    private javax.swing.JRadioButton radioButtonFalso217;
    private javax.swing.JRadioButton radioButtonFalso218;
    private javax.swing.JRadioButton radioButtonFalso219;
    private javax.swing.JRadioButton radioButtonFalso22;
    private javax.swing.JRadioButton radioButtonFalso220;
    private javax.swing.JRadioButton radioButtonFalso222;
    private javax.swing.JRadioButton radioButtonFalso223;
    private javax.swing.JRadioButton radioButtonFalso224;
    private javax.swing.JRadioButton radioButtonFalso225;
    private javax.swing.JRadioButton radioButtonFalso227;
    private javax.swing.JRadioButton radioButtonFalso228;
    private javax.swing.JRadioButton radioButtonFalso229;
    private javax.swing.JRadioButton radioButtonFalso23;
    private javax.swing.JRadioButton radioButtonFalso230;
    private javax.swing.JRadioButton radioButtonFalso231;
    private javax.swing.JRadioButton radioButtonFalso232;
    private javax.swing.JRadioButton radioButtonFalso233;
    private javax.swing.JRadioButton radioButtonFalso234;
    private javax.swing.JRadioButton radioButtonFalso235;
    private javax.swing.JRadioButton radioButtonFalso236;
    private javax.swing.JRadioButton radioButtonFalso238;
    private javax.swing.JRadioButton radioButtonFalso239;
    private javax.swing.JRadioButton radioButtonFalso24;
    private javax.swing.JRadioButton radioButtonFalso240;
    private javax.swing.JRadioButton radioButtonFalso241;
    private javax.swing.JRadioButton radioButtonFalso242;
    private javax.swing.JRadioButton radioButtonFalso243;
    private javax.swing.JRadioButton radioButtonFalso244;
    private javax.swing.JRadioButton radioButtonFalso246;
    private javax.swing.JRadioButton radioButtonFalso247;
    private javax.swing.JRadioButton radioButtonFalso248;
    private javax.swing.JRadioButton radioButtonFalso249;
    private javax.swing.JRadioButton radioButtonFalso25;
    private javax.swing.JRadioButton radioButtonFalso250;
    private javax.swing.JRadioButton radioButtonFalso251;
    private javax.swing.JRadioButton radioButtonFalso253;
    private javax.swing.JRadioButton radioButtonFalso254;
    private javax.swing.JRadioButton radioButtonFalso255;
    private javax.swing.JRadioButton radioButtonFalso256;
    private javax.swing.JRadioButton radioButtonFalso257;
    private javax.swing.JRadioButton radioButtonFalso258;
    private javax.swing.JRadioButton radioButtonFalso259;
    private javax.swing.JRadioButton radioButtonFalso26;
    private javax.swing.JRadioButton radioButtonFalso260;
    private javax.swing.JRadioButton radioButtonFalso261;
    private javax.swing.JRadioButton radioButtonFalso262;
    private javax.swing.JRadioButton radioButtonFalso263;
    private javax.swing.JRadioButton radioButtonFalso265;
    private javax.swing.JRadioButton radioButtonFalso266;
    private javax.swing.JRadioButton radioButtonFalso267;
    private javax.swing.JRadioButton radioButtonFalso268;
    private javax.swing.JRadioButton radioButtonFalso269;
    private javax.swing.JRadioButton radioButtonFalso270;
    private javax.swing.JRadioButton radioButtonFalso271;
    private javax.swing.JRadioButton radioButtonFalso272;
    private javax.swing.JRadioButton radioButtonFalso273;
    private javax.swing.JRadioButton radioButtonFalso274;
    private javax.swing.JRadioButton radioButtonFalso275;
    private javax.swing.JRadioButton radioButtonFalso276;
    private javax.swing.JRadioButton radioButtonFalso277;
    private javax.swing.JRadioButton radioButtonFalso278;
    private javax.swing.JRadioButton radioButtonFalso279;
    private javax.swing.JRadioButton radioButtonFalso28;
    private javax.swing.JRadioButton radioButtonFalso280;
    private javax.swing.JRadioButton radioButtonFalso281;
    private javax.swing.JRadioButton radioButtonFalso282;
    private javax.swing.JRadioButton radioButtonFalso284;
    private javax.swing.JRadioButton radioButtonFalso285;
    private javax.swing.JRadioButton radioButtonFalso287;
    private javax.swing.JRadioButton radioButtonFalso288;
    private javax.swing.JRadioButton radioButtonFalso289;
    private javax.swing.JRadioButton radioButtonFalso29;
    private javax.swing.JRadioButton radioButtonFalso290;
    private javax.swing.JRadioButton radioButtonFalso291;
    private javax.swing.JRadioButton radioButtonFalso292;
    private javax.swing.JRadioButton radioButtonFalso293;
    private javax.swing.JRadioButton radioButtonFalso294;
    private javax.swing.JRadioButton radioButtonFalso295;
    private javax.swing.JRadioButton radioButtonFalso296;
    private javax.swing.JRadioButton radioButtonFalso298;
    private javax.swing.JRadioButton radioButtonFalso299;
    private javax.swing.JRadioButton radioButtonFalso3;
    private javax.swing.JRadioButton radioButtonFalso30;
    private javax.swing.JRadioButton radioButtonFalso300;
    private javax.swing.JRadioButton radioButtonFalso301;
    private javax.swing.JRadioButton radioButtonFalso302;
    private javax.swing.JRadioButton radioButtonFalso304;
    private javax.swing.JRadioButton radioButtonFalso305;
    private javax.swing.JRadioButton radioButtonFalso306;
    private javax.swing.JRadioButton radioButtonFalso308;
    private javax.swing.JRadioButton radioButtonFalso309;
    private javax.swing.JRadioButton radioButtonFalso31;
    private javax.swing.JRadioButton radioButtonFalso310;
    private javax.swing.JRadioButton radioButtonFalso311;
    private javax.swing.JRadioButton radioButtonFalso312;
    private javax.swing.JRadioButton radioButtonFalso313;
    private javax.swing.JRadioButton radioButtonFalso314;
    private javax.swing.JRadioButton radioButtonFalso315;
    private javax.swing.JRadioButton radioButtonFalso316;
    private javax.swing.JRadioButton radioButtonFalso317;
    private javax.swing.JRadioButton radioButtonFalso318;
    private javax.swing.JRadioButton radioButtonFalso319;
    private javax.swing.JRadioButton radioButtonFalso32;
    private javax.swing.JRadioButton radioButtonFalso321;
    private javax.swing.JRadioButton radioButtonFalso322;
    private javax.swing.JRadioButton radioButtonFalso323;
    private javax.swing.JRadioButton radioButtonFalso34;
    private javax.swing.JRadioButton radioButtonFalso35;
    private javax.swing.JRadioButton radioButtonFalso36;
    private javax.swing.JRadioButton radioButtonFalso37;
    private javax.swing.JRadioButton radioButtonFalso38;
    private javax.swing.JRadioButton radioButtonFalso39;
    private javax.swing.JRadioButton radioButtonFalso4;
    private javax.swing.JRadioButton radioButtonFalso40;
    private javax.swing.JRadioButton radioButtonFalso41;
    private javax.swing.JRadioButton radioButtonFalso42;
    private javax.swing.JRadioButton radioButtonFalso43;
    private javax.swing.JRadioButton radioButtonFalso44;
    private javax.swing.JRadioButton radioButtonFalso45;
    private javax.swing.JRadioButton radioButtonFalso46;
    private javax.swing.JRadioButton radioButtonFalso47;
    private javax.swing.JRadioButton radioButtonFalso48;
    private javax.swing.JRadioButton radioButtonFalso5;
    private javax.swing.JRadioButton radioButtonFalso50;
    private javax.swing.JRadioButton radioButtonFalso51;
    private javax.swing.JRadioButton radioButtonFalso53;
    private javax.swing.JRadioButton radioButtonFalso55;
    private javax.swing.JRadioButton radioButtonFalso56;
    private javax.swing.JRadioButton radioButtonFalso57;
    private javax.swing.JRadioButton radioButtonFalso58;
    private javax.swing.JRadioButton radioButtonFalso59;
    private javax.swing.JRadioButton radioButtonFalso6;
    private javax.swing.JRadioButton radioButtonFalso60;
    private javax.swing.JRadioButton radioButtonFalso61;
    private javax.swing.JRadioButton radioButtonFalso62;
    private javax.swing.JRadioButton radioButtonFalso63;
    private javax.swing.JRadioButton radioButtonFalso64;
    private javax.swing.JRadioButton radioButtonFalso65;
    private javax.swing.JRadioButton radioButtonFalso67;
    private javax.swing.JRadioButton radioButtonFalso68;
    private javax.swing.JRadioButton radioButtonFalso69;
    private javax.swing.JRadioButton radioButtonFalso7;
    private javax.swing.JRadioButton radioButtonFalso70;
    private javax.swing.JRadioButton radioButtonFalso71;
    private javax.swing.JRadioButton radioButtonFalso72;
    private javax.swing.JRadioButton radioButtonFalso73;
    private javax.swing.JRadioButton radioButtonFalso74;
    private javax.swing.JRadioButton radioButtonFalso76;
    private javax.swing.JRadioButton radioButtonFalso77;
    private javax.swing.JRadioButton radioButtonFalso78;
    private javax.swing.JRadioButton radioButtonFalso79;
    private javax.swing.JRadioButton radioButtonFalso8;
    private javax.swing.JRadioButton radioButtonFalso80;
    private javax.swing.JRadioButton radioButtonFalso81;
    private javax.swing.JRadioButton radioButtonFalso82;
    private javax.swing.JRadioButton radioButtonFalso84;
    private javax.swing.JRadioButton radioButtonFalso85;
    private javax.swing.JRadioButton radioButtonFalso86;
    private javax.swing.JRadioButton radioButtonFalso87;
    private javax.swing.JRadioButton radioButtonFalso88;
    private javax.swing.JRadioButton radioButtonFalso89;
    private javax.swing.JRadioButton radioButtonFalso9;
    private javax.swing.JRadioButton radioButtonFalso90;
    private javax.swing.JRadioButton radioButtonFalso91;
    private javax.swing.JRadioButton radioButtonFalso92;
    private javax.swing.JRadioButton radioButtonFalso93;
    private javax.swing.JRadioButton radioButtonFalso94;
    private javax.swing.JRadioButton radioButtonFalso96;
    private javax.swing.JRadioButton radioButtonFalso97;
    private javax.swing.JRadioButton radioButtonFalso98;
    private javax.swing.JRadioButton radioButtonFalso99;
    // End of variables declaration//GEN-END:variables


}
