import ColorBends from "../components/external/react-bits/backgrounds/ColorBends";

function App() {
  return (
    <div
      style={{
        width: "1000px",
        height: "500px",
        margin: "50px auto",
        borderRadius: "16px",
        overflow: "hidden"
      }}
    >
      <ColorBends
        colors={["#ff5c7a", "#8a5cff", "#00ffd1"]}
        rotation={90}
        speed={0.2}
        scale={1}
        frequency={1}
        warpStrength={1}
        mouseInfluence={1}
        noise={0.15}
        parallax={0.5}
        iterations={1}
        intensity={1.5}
        bandWidth={6}
        transparent
        autoRotate={0}
        color="#A855F7"
      />
    </div>
  );
}

export default App;