package paquete;

public class ColectivoConUnInspector_32079839 extends Vehiculo {

	public ColectivoConUnInspector_32079839(int ingresosPorA,int ingresosPorB) {
			super(ingresosPorA, ingresosPorB);
			}

			@Override
			public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
				synchronized(this.getInspectorA()){				
				
				int pA,NumpA;
				pA = this.getIngresosPermitidosPorPuertaA();
				NumpA = this.getIngresosPorPuertaA();

				if(NumpA<pA){
					this.incrementarIngresosPorPuertaA();
				}
			}
			}

			@Override
			public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
				synchronized(this.getInspectorA()){	
				
				int pB,NumpB;
				pB = this.getIngresosPermitidosPorPuertaB();
				NumpB = this.getIngresosPorPuertaB();
				
				if(NumpB<pB){
					this.incrementarIngresosPorPuertaB();
				}
				}
			}

			@Override
			public String getAPELLIDONombreDelAlumno() {
				String nombre = "RIBODINO, José";
				return nombre;
			}
		}
