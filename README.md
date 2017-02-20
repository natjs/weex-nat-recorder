# nat-recorder

## Installation
```
weexpack plugin add nat-recorder
```

```
npm install weex-nat --save
```

## Usage

Use in weex file (.we)

```html
<script>
import 'Nat' from 'weex-nat'

Nat.recorder.start()

Nat.recorder.pause()

Nat.recorder.stop((err, ret) => {
    console.log(ret)
})

</script>
```

See the Nat [Documentation](http://natjs.com/) for more details.
